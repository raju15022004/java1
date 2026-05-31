// package Assigment;

public class Itrim {

  static String Itrim(String s){
    if(s == null){
      return null;
    }

    int i=0;

    //left side space skip karo
    while(i<s.length() && s.charAt(i) == ' '){
      i++;
    }
    return s.substring(i);
  }

  public static void main(String[] args) {
      String s="Raj";
      System.out.println(Itrim(s));
  }

}
