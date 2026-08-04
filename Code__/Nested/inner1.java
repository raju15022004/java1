public class inner1 {

  public static void main(String[] args) {

    Outer outer=new Outer();

    // Outer.Inner inner=outer.new Inner();
    // inner.fun();

    Outer.Inner inner=outer.new Inner();

    inner.fun();
    inner.fun2();
    Outer.Inner.fun2();

  }

}

class Outer{

  int x=10;

  class Inner{
    void fun(){
      System.out.println(x);
    }

    static void fun2(){
      System.out.println("hello");
    }
  }
}
