// package stringbuffer;

public class Format {

  public static void main(String[] args) {
      float floatVar=2.4f;
      int intVar=10;
      String stringVar="HINDUSTAN";
      System.out.printf("The value of float variable is= %f,while the value of the integer variable is =%d, and the string is =%s", floatVar,intVar,stringVar);

      String fs =String.format("The value of float variable is= %f,while the value of the integer variable is =%d, and the string is =%s", floatVar,intVar,stringVar);
      System.out.println("    ");
      System.out.println(fs);
  }

}
