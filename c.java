
// class A{

//   A(){

//     System.out.println("A");
//   }
// }

// class B extends A{

//   B(int x){
//     System.out.println(x);
//   }

//   B(){
//     System.out.println("B");
//   }
// }

// class C extends B{

//   C(){

//     super(10);
//     // this(10);
//     System.out.println("C");

//   }

//   C(int x){
//     super();
//     System.out.println(x);
//   }

//   public static void main(String[] args) {
//       //  new C ();
//        new C (12);
//   }
// }



class A {

    A() {
        System.out.println("A");
    }
}

class B extends A {

    B(int x) {
        System.out.println(x);
    }

    B() {
        System.out.println("B");
    }
}

public class Demo2 extends B {

    Demo2() {
        super(10);          // B(int x) call karega
        System.out.println("C");
    }

    Demo2(int x) {
        super();            // B() call karega
        System.out.println(x);
    }

    public static void main(String[] args) {

        // new Demo2();
        new Demo2(12);

    }
}
