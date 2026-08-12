public class Generics2{

  public static void main(String[] args) {
    Animal animal=new Animal();
    animal.eat();
    animal.walk();

  }
}

class Animal{
  void eat(){
    System.out.println("Eating");
  }
  void walk(){
    System.out.println("Walking");
  }

}

class dog extends Animal{
  void bark(){
    System.out.println("Barking");
  }


}
