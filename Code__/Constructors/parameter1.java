// package Code__.Constructors;

public class parameter1 {

  public static void main(String[] args) {
      Student s1=new Student("Raju",22,101,"ggi");

      System.out.println(s1.name);
      System.out.println(s1.age);
      System.out.println(s1.rollNumber);
      System.out.println(s1.college);
  }

}

class Student{
  String name;
  int age;
  int rollNumber;
  String college;

     Student(String n,int a,int rn,String c){
      name =n;
      age=a;
      rollNumber=rn;
      college=c;


     }

void markAttendance(){
  System.out.println("Attendance marked for student " + name);
}

}
