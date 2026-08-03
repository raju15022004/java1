// package Variable;

public class Abstract {

  public static void main(String[] args) {
    Animal a=new Dog();

    a.makesound();

  }

}

abstract class Animal{

  abstract void makesound();

  void sleep(){
    System.out.println("Sleeping");
  }
}

class  Dog extends Animal{
  @Override
  void makesound(){
    System.out.println("making barking sound");
  }
}
