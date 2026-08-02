// package Oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestRetrive1 {

    public static void main(String[] args) {

        try {

           Class.forName("oracle.jdbc.OracleDriver");

            Connection c = DriverManager.getConnection(
    "jdbc:oracle:thin:@//localhost:1521/orclpdb",
    "system",
    "@$Raju@678");

            Statement s = c.createStatement();

            ResultSet rs = s.executeQuery("SELECT * FROM student");

while (rs.next()) {
    System.out.println(
        rs.getInt("sid") + " " +
        rs.getString("sname") + " " +
        rs.getInt("age") + " " +
        rs.getString("course")
    );
}

            rs.close();
            s.close();
            c.close();

        } catch (SQLException e) {

            System.out.println(e);

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
