import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compare {

  public static void main(String[] args){

    List<Student> list=new ArrayList<>();

    list.add(new Student("Raju", 95));
     list.add(new Student("Rohit", 80));
    list.add(new Student("Raj", 70));

    Collections.sort(list);

    for(Student s:list){
      System.out.println(s.name +" , " + s.marks);
    }
    // System.out.println(list);




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
