public class Emp2{
  static String cname="tcs";
  String name;
  int Salary;

  void get(String s1,int s2){
    name=s1;
    Salary=s2;
  }
  void show()
  {
    System.out.println(name);
    System.out.println(Salary);
    System.out.println(cname);
  }
  static int add(int a,int b)
  {
    return a+b;
  }
  public static void main(String[] args) {
      Emp2 e1=new Emp2();
      System.out.println(e1.hashCode());

      System.out.println(e1);
      e1.name="lalu";
      System.out.println(e1.name);
      Emp2 e2=e1;
      System.out.println(e2.hashCode());
      System.out.println(e2);

      e2.name="raju";
      System.out.println(e1.name);
  }
  
}
