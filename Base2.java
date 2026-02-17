class Dadaji{

  int x=50;

}

class Base extends Dadaji{
  int x=20;

}

class child extends Base{

  int x=20;
  void show(){
    System.out.println(x);
    System.out.println(super.x);
    System.out.println(((Dadaji)this).x);
    System.out.println(((Base)this).x);
  }
}

public class Base2{
  public static void main(String[] args) {
      child c1=new child();
      c1.show();
  }
}

