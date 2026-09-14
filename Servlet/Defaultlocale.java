// package Servlet;
import java.text.DateFormat;
import java.util.Locale;

class DefaultLocale {

  public static void main(String[] args) {
      Locale list[]=DateFormat.getAvailableLocales();
      for(int i=0;i<list.length;i++)
        System.out.println(list[i].toString());
  }

}
