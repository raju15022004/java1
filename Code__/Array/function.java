public class function{

  public static void main(String[] args) {

    // greet();
    sayHello("raju");

  }

  // No Ip,No op
  static void greet() {
    System.out.println("Hello");

  }

  // Ip , No Op
  static void sayHello(String name) {
    System.out.println("Hello" + name);

  }

  // No ip,Op
  static int getNumber() {
   return 10;
  }

  // Ip,Op
  static int multiply(int a,int b) {
    return (a * b);

  }

}
