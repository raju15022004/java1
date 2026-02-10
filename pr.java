// public class pr{
//   static void show(char x){
//     System.out.println("no return type");
//   }
//   static int show(int z){
//     System.out.println("with return type");
//     return z;
//   }
//   public static void main(String[] args) {
//       show('a');
//       show(200);
//       int a=show(10);
//       System.out.println(a);
//   }
// }

///////////////////////////////////////////////////

// public class pr{
//   static  void show(int x,long f){
//     System.out.print("int long argument");
//   }
//   static void show(long x,int z){
//     System.out.println("long int arguments");
//   }
//   public static void main(String[] args) {
//       // show(10,10l);
//       show(10l,10);
//       // show(10, 10);
//   }
// }


//////////////////////////////////////////////////////
public class pr{
  static void show(){
    System.out.println("zero arguments");
  }
  static void show(int x){
    System.out.println("one arguments");
  }
  static void show(int x,int y){
    System.out.println("two arguments");
  }
  static void show(int x,int y,int z){
    System.out.println("three arguments");
  }
  public static void main(String[] args) {
      show();
      show(10);
      show(10,10);
      show(10,10,10);
  }
}
