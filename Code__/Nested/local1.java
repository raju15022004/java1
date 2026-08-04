public class local1 {

  public static void main(String[] args) {
      Outer outer=new Outer();
      outer.greet();
  }

}

class Outer{
  void greet(){
    class local{
      void sayHello(){
        System.out.println("hello");
      }
    }

    local local=new local();
    local.sayHello();
  }
}
