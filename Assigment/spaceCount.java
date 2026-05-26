// package Assigment;

public class spaceCount {
  static int  spaceCount(String s) {
    if(s == null || s.isEmpty()){
      return 0;

    }

    int count = 0;

    for(int i=0;i<s.length();i++){
      if(s.charAt(i) == ' '){
        count++;
      }
    }
    return count;

  }
  public static void main(String[] args) {
      String s="Hello java world";
      System.out.println(spaceCount(s));
  }

}
