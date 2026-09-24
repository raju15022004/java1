import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendMailSSL {

    public static void main(String[] args) {

        // Jis email par mail bhejna hai
        String to = "YOUR_RECEIVER@gmail.com";

        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        try {

            Session session =
                    Session.getDefaultInstance(props, new MyAuth());

            MimeMessage message = new MimeMessage(session);

            // Your Gmail
            message.setFrom(
                    new InternetAddress("rajukumar15022002@gmail.com")
            );

            // Receiver
            message.addRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress(to)
            );

            message.setSubject("First Mail");

            Multipart body = new MimeMultipart();

            // Email body
            MimeBodyPart part1 = new MimeBodyPart();
            part1.setText("Hello, this is my first mail.");
            body.addBodyPart(part1);

            // Attachment
            MimeBodyPart part2 = new MimeBodyPart();

            FileDataSource fds = new FileDataSource(
                    "screenshot.jpg"
            );

            part2.setDataHandler(new DataHandler(fds));
            part2.setFileName(fds.getName());

            body.addBodyPart(part2);

            message.setContent(body);

            // Send email
            Transport.send(message);

            System.out.println("message sent successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// Authentication
class MyAuth extends javax.mail.Authenticator {

    protected PasswordAuthentication getPasswordAuthentication() {

        return new PasswordAuthentication(
                "rajukumar15022002@gmail.com",
                "YOUR_GOOGLE_APP_PASSWORD"
        );
    }
}
