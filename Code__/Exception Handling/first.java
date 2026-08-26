public class first {

  public static void main(String[] args) {
   System.out.println("Step 1");

   try {
    int a=5;
    int b=0;

    System.out.println(a/b);

   } catch (Exception e) {
    System.out.println("Division by zero is not allowed");
   }
   System.out.println("Step 2");
  }
}
