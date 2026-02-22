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

public class Demo2 extends B{

  Demo2(){

    super(10);

    // this(10);
    System.out.println("C");


  }

  Demo2(int x){
    super();
    System.out.println(x);
  }

  public static void main(String[] args) {
      //  new C ();
       new Demo2(12);
  }
}



