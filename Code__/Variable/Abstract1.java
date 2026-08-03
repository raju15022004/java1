// package Variable;

public class Abstract1 {

  public static void main(String[] args) {
    Animal a=new Dog();
    a.sleep();
    a.sound();

  }

}

abstract class Animal{

  abstract void sound();

  void sleep(){
    System.out.println("Sleeping");
  }


}

class Dog extends Animal{
  @Override
  void sound(){
    System.out.println("sounding");
  }

}
