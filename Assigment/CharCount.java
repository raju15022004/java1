// package Assigment;

public class CharCount {
  static int CharCount(String s){
    if(s == null || s.isEmpty()){
      return 0;
    }

    int count=0;

    for(int i=0;i<s.length();i++){
      if(s.charAt(i) !=' '){
        count++;
      }
    }

    return count;
  }
  public static void main(String[] args) {
      String s="Hello java ";
      System.out.println(CharCount(s));
  }

}
