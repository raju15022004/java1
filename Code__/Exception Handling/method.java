public class method {

  public static void main(String[] args) {
      methodA(5,0);
  }
  private static void methodA(int a,int b){
    try {
      methodB(a,b);

    } catch (Exception e) {

      System.out.println("division by zero is not allowed");
    }
  }
  private static void methodB(int a,int b){
    System.out.println(a/b);
  }

}
