// public class function1 {
//   public static void main(String[] args) {

//       greet(10,20);

//   }
//   static void greet(int a,int b){
//     System.out.println(" sum ="+(a+b));

//   }
// }


// multiple

// public class function1{

//   public static void main(String[] args) {
//       int result=multiply(5,4);
//       System.out.println(result);
//   }

//   static int multiply(int a,int b){
//     return a*b;
//   }
// }


// boolean

// public class function1{

//   public static void main(String[] args) {
//       System.out.println(isEvent(7));
//   }

//   static boolean isEvent(int n){
//     return n%2==0;
//   }
// }

// factor

public class function1{

  public static void main(String[] args) {
      System.out.println(factorial(6));
  }

  static int factorial(int n){
    if(n == 1)
      return 1;
    return n *factorial(n-1);
  }
}
