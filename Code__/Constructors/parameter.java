// package Code__.Constructors;

public class parameter {

  public static void main(String[] args) {
      Student s1=new Student();

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

     Student(){
      name="Raju";
      age=22;
      rollNumber=2232151;
      college="Ggi";

     }

void markAttendance(){
  System.out.println("Attendance marked for student " + name);
}

}
