class A{

  A(){
    System.out.println("A");
  }
}

class B extends A{

  B(int x){
    System.out.println(x);
  }
  B(){
    System.out.println("B");
  }
}

public class Demo3 extends B{
  {
    System.out.println("init block of Demo3");
  }

  Demo3(){
    System.out.println("Demo3");
    super(10);
  }
  Demo3(int x){
    System.out.println(x);

  }

  public static void main(String[] args) {
      // new Demo3();
      new Demo3(12);
  }
}
