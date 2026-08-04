public class anon {

  public static void main(String[] args) {
      Person p1=new Person();
      p1.introduce();

      Person p2=new Guest();
      p2.introduce();
  }

}

class Person{

  void introduce(){
    System.out.println("HI, i am aperson");
  }
}

class Guest extends Person{
  @Override
  void introduce(){
    System.out.println("Hi,I am a Guest");
  }
}
