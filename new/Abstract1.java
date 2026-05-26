abstract  class Base{
  int x;
  int y;

  void show(){
    System.out.println(x);
    System.out.println(y);
  }
  abstract void display();
}

class child extends Base{

  void get(int x,int y){
    this.x=x;
    this.y=y;
  }
  void display(){
    System.out.println("display");
  }
}

class myRegistor{

  void registor(Base b){
    b.display();
  }
}

public class Abstract1 {

  public static void main(String[] args){
    child c=new child();
    myRegistor my=new myRegistor();
    my.registor(c);
  }
}
