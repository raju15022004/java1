class Base{

  void show(){
    System.out.println("Base");
  }
}

class child extends Base{
  void show(){
    System.out.println("show");
  }
  void display(){
    System.out.println("display");
  }
}

public class over{
  public static void main(String[] args){
    Base b=new child();
    System.out.println(b);
  }
}
