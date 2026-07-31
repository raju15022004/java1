

public class inheri {

  public static void main(String[] args) {
    EngineeringStudent es=new EngineeringStudent();
    es.markAttendance();
    es.attendlab();

  }

}

class Student{
  String name;
  int age;

  void markAttendance(){
    System.out.println("Attendance marked");
  }
}

class EngineeringStudent extends Student{
  void attendlab(){
    System.out.println("lab attended");
  }
}


