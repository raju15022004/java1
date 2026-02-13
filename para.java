public class para{

  int x;
  int y;

  para(int x,int y){
    this.x=x;
    this.y=y;
  }
  void show(){
    System.out.println(x);
    System.out.println(y);
  }

  public static void main(String[] args) {
      para d1=new para(10,20);
      d1.show();

      para d2 = new para(100, 200);
      d2.show();


  }
}
