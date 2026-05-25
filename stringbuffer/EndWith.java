// package stringbuffer;

public class EndWith {

  public static void main(String[] args) {

    String str=new String("This is really not immutable!");
    boolean retVal;

    retVal=str.endsWith("immutable!");
    System.out.println("Returned Value = " + retVal);
  }

}
