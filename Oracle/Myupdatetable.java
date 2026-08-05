
// import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Myupdatetable {

  public static void main(String[] args) {

    Statement st=null;
    ResultSet rs=null;



    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@//localhost:1521/orclpdb",
    "system",
    "@$Raju@678");

    st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    rs = st.executeQuery("SELECT id, balance FROM Bank");

    rs.next();
    rs.deleteRow();
    System.out.println("record deleted");
    }catch(Exception e){

      System.out.println(e);
    }
  }

}
