// package Assigment;

public class squeeze {

  static String squeeze(String s){

    if(s == null){
      return null;
    }

    String result="";

    for(int i=0;i<s.length(); i++){
      if(s.charAt(i) !=' '){
        result = result + s.charAt(i);
      }
    }

    return result;
  }

  public static void main(String[] args) {
      String s="Raju Kumar";
      System.out.println(squeeze(s));
  }

}
