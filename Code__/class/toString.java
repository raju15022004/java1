public class toString {

  public static void main(String[] args) {
    Student s1=new Student();
    s1.name="Raju";
    s1.age=28;

    System.out.println(s1.toString());
  }
}

class Student {
  String name;
  int age;

  @Override
  public String toString(){
    return (name + ","+age);
  }
}
