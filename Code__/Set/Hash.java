// package Set;

import java.util.HashMap;
import java.util.Map;

public class Hash {

  public static void main(String[] args) {

    // HashSet<Student> set=new HashSet<>();
    // set.add(new Student(101));
    // set.add(new Student(101));

    // System.out.println(set.size());

    // Map

    Map<Integer,String> map=new HashMap<>();

    map.put(101, "Raju");
    map.put(102, "Amit");
    map.put(103, "Rahul");

    System.out.println(map);

  }

}

class Student{
  int id;

     Student(int id) {
      this.id=id;
    }

    @Override
    public int hashCode(){
      return id;
    }

    @Override
    public boolean equals(Object obj){
      Student s=(Student) obj;

      return this.id==s.id;
    }


}
