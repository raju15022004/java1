public class emp{
  // public static void main(String[] args) {

      static String cname="TCS";

      String name;
      int salary;

      void get(String s1, int s2){
        name=s1;
        salary=s2;

      }

      void show(){
        System.out.println("name"+name);
        System.out.println("salary"+salary);
        System.out.println("cname"+cname);
      }

      public static void main(String[] args) {

        emp e1=new emp();
        e1.get("raju",500000);
        e1.show();
          System.out.println( "company :"+emp.cname);
          // System.out.println("emp.cname");
      }
  }

