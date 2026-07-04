// package Assigment;

public class rTrim {

  static String rTrim(String s){
    if(s == null){
      return null;
    }

    int i=s.length()-1;

    //right side space skip karo
    while(i>= 0 && s.charAt(i) == ' '){
      i--;
    }

    return s.substring(0,i+1);
  }

  public static void main(String[] args) {
      String s="raju kumar";
      System.out.println(rTrim(s));
  }

}
