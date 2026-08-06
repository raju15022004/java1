public class toString {

  public static void main(String[] args) {
    Student s1=new Student();
    s1.name="Raju";
    s1.age=28;

    // System.out.println(s1.toString());

    Student s2=new Student();
    s2.name="Raju";
    s2.age=28;

    System.out.println(s1.equals(s2));
  }
}

class Student {
  String name;
  int age;

  @Override
  public String toString(){
    return (name + ","+age);
  }

  @Override
  public  boolean equals (Object obj){
    Student s=(Student ) obj;
    return (this.name == s.name && this.age == s.age);
  }
}
