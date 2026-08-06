public class Immutable{

  public static void main(String[] args) {
    Student s1=new Student(28,"raju","GGI");

    System.out.println(s1.getName());
    System.out.println(s1.getAge());
    System.out.println(s1.getCollege());
  }
}

final class Student{
  private final int age;
  private final String name;
  private final String college;

    public Student(int age,String name,String college) {
        this.age = age;
        this.name = name;
        this.college = college;
    }

    public int getAge(){
      return this.age;
    }

    public String getName() {
      return this.name;

    }

    public String getCollege(){
      return this.college;
    }


}
