class Base{

  int x=20;
  void show(){
    System.out.println("Base");
  }
}

class child extends Base{

  int x=30;
  void show(){
  System.out.println("child");
  }

  void display(){
    System.out.println("display");
  }
}
public class Ch1{
  public static void main(String[] args) {
      Base b=new child();
      b.show();
      child c=(child)b;
      c.display();
      System.out.println(b.x);
      System.out.println(c.x);

  }
}
