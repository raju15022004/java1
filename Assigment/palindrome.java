// package Assigment;

public class palindrome {

  static boolean palindrome(String s){
    if(s == null){
      return false;
    }

    int i=0;
    int j=s.length()-1;

    while(i<j){
      if(s.charAt(i) !=s.charAt(j)){
        return false;
      }
      i++;
      j--;
    }

    return true;
  }

  public static void main(String[] args) {
      String s="raju kumar";
      System.out.println(palindrome(s));
  }

}
