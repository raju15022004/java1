public class Static {

  public static void main(String[] args) {

    Student s1=new Student("Raju", 22, 101);
    Student s2=new Student("Raj", 23, 103);

    Student.college="Ggi";

    System.out.println(s1.name +"," + s1.age + "," +s1.rollNumber + "," + s1.college);
    System.out.println(s2.name +"," + s2.age + "," +s2.rollNumber + "," + s2.college);

  }

}

class Student{
  String name;
  int age;
  int rollNumber;
  static String college;

     Student(String name,int age,int rollNumber) {
      this.name=name;
      this.age=age;
      this.rollNumber=rollNumber;
    }


}
