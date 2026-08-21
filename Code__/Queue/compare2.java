import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compare2 {
  public static void main(String[] args) {

    List<Student> list=new ArrayList<>();

    list.add(new Student("Raju", 101, 85));
     list.add(new Student("Raj", 102, 80));
    list.add(new Student("Rohit", 103, 70));
    list.add(new Student("sonu", 101, 90));

    Collections.sort(list);

    for(Student s: list){
      System.out.println(s.name + " , " + s.rollNo + " , " + s.marks);
    }



  }

}

class Student implements Comparable<Student>{
  String name;
  int rollNo;
  int marks;

  public Student(String name, int rollNo, int marks){
    this.name=name;
    this.rollNo=rollNo;
    this.marks=marks;
  }

  @Override
  public int compareTo(Student s){
    return this.marks - s.marks;
  }
}
