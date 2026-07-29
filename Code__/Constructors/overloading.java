// package Code__.Constructors;

public class overloading {

  public static void main(String[] args) {

    Student s1=new Student();
    Student s2=new Student("Raju");
    Student s3=new Student("Raj",22);
    Student s4=new Student("Shivek",22,103);
    Student s5=new Student("bablu",22,104,"ggi");

    System.out.println(s3.age);

  }

}

class Student{
  String name;
  int age;
  int rollNumber;
  String college;

     Student() {
        this("Unknown", 0, 0, "Unknown");
    }

     Student(String name){
      this(name, 0, 0, "Unknown");
    }

    Student(String name,int age){
      this(name,age,0,"Unknown");
    }

     Student(String name,int age,int rollNumber){
      this(name,age,rollNumber,"Unknown");

    }

    Student(String name,int age,int rollNumber,String college){
       this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }


    void markAttendance(){
      System.out.println("Attendance marked for student " + name);
    }
}
