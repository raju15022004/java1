// package Oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestRetrive {

    public static void main(String[] args) {

        try {

           Class.forName("oracle.jdbc.OracleDriver");

            Connection c = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system",
                    "@$Raju@678");

            Statement s = c.createStatement();

            ResultSet resultSet = s.executeQuery("SELECT * FROM employee");

            while (resultSet.next()) {

                System.out.println(
                        resultSet.getString("name") + " = "
                        + resultSet.getString(2));
            }

            resultSet.close();
            s.close();
            c.close();

        } catch (SQLException e) {

            System.out.println(e);

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
