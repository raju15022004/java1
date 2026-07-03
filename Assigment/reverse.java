// package Assigment;

public class reverse {

  static String reverse(String s){
    if(s == null || s.isEmpty()){
      return "";
    }

    String rev="";

    for(int i=s.length()-1;i>=0;i--){
      rev=rev+s.charAt(i);
    }

    return rev;

  }
  public static void main(String[] args) {
      String s="1,2,3,4,4,5,6,7";
      System.out.println(reverse(s));
  }

}
