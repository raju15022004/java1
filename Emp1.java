public class Emp1{


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
static  int add(int a,int b){
  return a+b;
}
public static void main(String[] args) {
    Emp1 e1=new Emp1();
    e1.get("lalu",100);
    e1.show();

    System.out.println(cname);
    System.out.println(Emp1.cname);
    int z=Emp1.add(10,20);
    System.out.println(z);

    z=add(10,200);
    System.out.println(z);
}
}

class Demo{
  public static void main(String[] args) {
      Emp1 e2=new Emp1();

      e2.get("rabari",51);
      e2.show();

      int z=Emp1.add(10,30);
      System.out.println(z);
      System.out.println(Emp1.cname);
  }
}
