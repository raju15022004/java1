public class Arithmetic {

  public static void main(String[] args) {
    try {
      System.out.println("Outer try starts");
    
      try {
          System.out.println("Inner try starts");

          System.out.println(5/0);

          System.out.println("Inner try ends");
      } catch (Exception e) {
        System.out.println("divide by zero is not allowed: Inner");
      }

      System.out.println("Outer try ends");
  }
  catch(ArithmeticException e){
    System.out.println("Divide by zero not allowed: outer");
  }

}
}
