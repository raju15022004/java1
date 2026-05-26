class Base{

  A show(){
    System.out.println("base");
    return new A();
  }
}

class child extends Base{

  B show(){
    System.out.println("show");
    return new B();
  }

  void display(){
    System.out.println("display");
  }
}

   public class Demo1{
  public static void main(String[] args){
    child c=new child();
     c.show();

  }
}

class A{

}
class B extends A{

}

