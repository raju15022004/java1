import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class I18nServlet extends HttpServlet
{
    public void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        String t = null;
        String name = null;
        String pass = null;

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        Locale l = req.getLocale();

        ResourceBundle rb =
                ResourceBundle.getBundle("ResourceBundle", l);

        Enumeration e = rb.getKeys();

        while (e.hasMoreElements())
        {
            String k = (String) e.nextElement();

            if (k.equals("app.title"))
            {
                t = rb.getString(k);
            }

            if (k.equals("app.username"))
            {
                name = rb.getString(k);
            }

            if (k.equals("app.password"))
            {
                pass = rb.getString(k);
            }
        }

        // Get username and password from form
        String username = req.getParameter("uname");
        String password = req.getParameter("upass");

        out.println("<html>");
        out.println("<body>");

        // Check login only when form is submitted
        if (username != null && password != null)
        {
            if (username.equals("admin") && password.equals("1234"))
            {
                out.println("<h1 style='color:green'>Login Successful</h1>");
                out.println("<h2>Welcome " + username + "</h2>");
            }
            else
            {
                out.println("<h1 style='color:red'>Invalid Username or Password</h1>");
            }

            out.println("</body>");
            out.println("</html>");
            return;
        }

        // Display login form
        out.println("<h1 style='color:blue'>" + t + "</h1>");
        out.println("<br>");

        out.println("<form action='i18n' method='get'>");

        out.println(name + " ");
        out.println("<input type='text' name='uname'>");

        out.println("<br><br>");

        out.println(pass + " ");
        out.println("<input type='password' name='upass'>");

        out.println("<br><br>");

        out.println("<input type='submit' value='Login'>");

        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }
}
