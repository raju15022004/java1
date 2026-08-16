import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student {

    public static void main(String[] args) {

        try {

            // MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // MySQL Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/college",
                "root",
                "@$Raju@678"
            );

            System.out.println("Database Connected Successfully");

            // SELECT query
            String sql = "SELECT * FROM student WHERE course=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Java");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("Marks: " + rs.getInt("marks"));
                System.out.println("--------------------");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
