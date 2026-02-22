// package mypack;

class A{

  A(){

    System.out.println("A");
  }
}

class B extends A{

  B(int x){
    System.out.println("x");
  }

  B(){
    System.out.println("B");
  }
}

class C extends B{

  C(){

    super(10);
    // this(10);
    System.out.println("C");

  }

  C(int x){
    super();
    System.out.println(x);
  }

  public static void main(String[] args) {
    System.out.println("Calling C()");
      new C ();

      System.out.println("Calling c(12)");
       new C (12);
  }
}
