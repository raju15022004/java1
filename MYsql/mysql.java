
// import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// package MYsql;

public class mysql {

  public static void main(String[] args) {


    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
     Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/emp?user=root&password=@$Raju@678");
      String t1="Raju";;
      int t2=420;

      Statement s=c.createStatement();
     s.executeUpdate("CREATE TABLE IF NOT EXISTS emp(name VARCHAR(50), salary INT)");
      s.close();

      PreparedStatement ps=c.prepareStatement("insert into emp values(?,?)");
      ps.setString(1, t1);
      ps.setInt(2, t2);
      ps.executeUpdate();
      ps.close();

      ps=c.prepareStatement("select * from emp where salary=?");
      ps.setInt(1,t2);
      ResultSet result1=ps.executeQuery();

      while (result1.next()) {

        System.out.println("name" + result1.getString(1));
        System.out.println("salary" + result1.getString(2));

      }
    } catch (Exception e) {

      System.out.println(e);
    }

  }

}
