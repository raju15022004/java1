// package package;

public class finallyex {

  static int show(){
    try
    {
      System.exit(0);
      int x=10/0;
      return 20;
    }
    catch(NullPointerException e){
      System.out.println(e);
    }
    finally{
      return 4000;
    }
  }

  public static void main(String[] args) {
      int x=show();
      System.out.println(x);
      finallyex f1=null;
      f1.show();
  }

}
