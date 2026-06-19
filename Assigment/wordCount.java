// package Assigment;

public class wordCount {

  static int wordCount(String s) {
    if(s == null || s.trim().isEmpty()){
      return 0;
    }

    String[] words = s.trim().split("\\s+");
    return words.length;

  }
  public static void main(String[] args) {
      String s="Hello java ";
      System.out.println(wordCount(s));
  }

}
