// package Assigment;

public class alltrim {

  static String alltrim(String s){
    if(s == null){
      return null;
    }

    int start=0;
    int end =s.length()-1;

    //left space remove
    while(start <= end && s.charAt(start)==' '){
      start++;
    }

    //right space remove
    while(end >= start && s.charAt(end) == ' '){
      end--;
    }
    return s.substring(start,end + 1);
  }

  public static void main(String[] args) {
      String s="raju ";
      System.out.println(alltrim(s));
  }

}
