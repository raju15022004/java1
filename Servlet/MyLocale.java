
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

// package Servlet;


public class MyLocale {
  public static void main(String[] args) {

    Locale l=new Locale("fr","FR");
    // Locale l=new Locale("hi","IN");

    //Locale l=Locale.getDefault();

    ResourceBundle rb=ResourceBundle.getBundle("ResourceBundle",l);

    System.out.println(Locale.getDefault().toString());

    Enumeration e=rb.getKeys();

    while(e.hasMoreElements()){
      String k=(String)e.nextElement();
      String v=rb.getString(k);

      System.out.println(k +"=" + v);
    }
  }

}
