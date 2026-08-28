import java.util.TreeSet;

public class compare1 {
  public static void main(String[] args) {

    Student s1=new Student("raju", 6);
    Student s2=new Student("Rohit", 60);

    TreeSet<Student> set =new TreeSet<>();

    set.add(s1);
    set.add(s2);

    System.out.println(set.size());
  }

}

class Student implements Comparable<Student>{
  String name;
  int marks;

  public Student(String name,int marks){
    this.name=name;
    this.marks=marks;
  }

  @Override
  public  int compareTo(Student other){
    return this.marks - other.marks;
  }
}

