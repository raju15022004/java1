

// import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetInsert {

  public static void main(String[] args) {

    Statement st=null;
    ResultSet rs=null;



    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@//localhost:1521/orclpdb",
    "system",
    "@$Raju@678");

    st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
   rs = st.executeQuery("SELECT acc_no, balance FROM bank1");

    while(rs.next()){
      System.out.println(rs.getInt(1)+"=");
      System.out.println(rs.getInt(2));
      System.out.println("");
    }
    rs.moveToInsertRow();
    rs.updateInt(1, 1007);
    rs.updateInt(2, 2000);
    rs.insertRow();

    rs.beforeFirst();
    rs=st.executeQuery("SELECT acc_no, balance FROM bank1");
    System.out.println("after insertion of new Record");

    while(rs.next()){
      System.out.println(rs.getInt(1)+"=");
      System.out.println(rs.getInt(2));
      System.out.println("   ");
    }
    }catch(Exception e){

      System.out.println(e);
    }
  }

}
