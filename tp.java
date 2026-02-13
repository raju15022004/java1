public class tp{

  int x;
  int y;

  //  Temp(){
  //  x=20;
  //  y=30;
  // }

  void show(){
    System.out.println(x);
    System.out.println(y);
  }

  public static void main(String[] args) {
      temp t1=new temp();
      t1.show(10);

      temp t2=new temp();
      t2.show(25);
  }
}
