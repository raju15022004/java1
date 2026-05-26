class Dcon{

  int x;
  int y;

     Dcon() {
      x=20;
      y=30;
    }
    void show(){
      System.out.println(x);
      System.out.println(y);
    }
    public static void main(String[] args) {
        Dcon d1=new Dcon();
        d1.show();
        Dcon d2=new Dcon();
        d2.show();
    }

}
