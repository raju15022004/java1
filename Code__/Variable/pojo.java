// package Variable;

public class pojo {
  public static void main(String[] args) {

    Student s=new Student();
    s.setId(101);
    s.setName("raju");

    System.out.println(s.getId());
    System.out.println(s.getName());

  }

}

class Student {

  private int id;
  private String name;

     Student() {

    }


Student(int id,String name){
  this.id=id;
  this.name=name;

}

public int getId(){
  return id;
}

public void setId(int id){
  this.id=id;
}

public String getName(){
  return name;
}

public void setName(String name){
  this.name=name;
}
}





