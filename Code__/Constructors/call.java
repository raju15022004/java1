// package Code__.Constructors;

public class call {
  static void change(int x) {
    x=100;
    System.out.println("Inside Method:"+x);

  }

  public static void main(String[] args) {
      int a=10;
      change(a);
      System.out.println("Outside Method:"+a);
  }

}
