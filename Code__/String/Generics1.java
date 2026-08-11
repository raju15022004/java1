

// public class Generics1 {

//   public static void main(String[] args) {

//     Box<Integer> b1=new Box<>(10);

// System.out.println(b1.getValue() +5);
//   }

// }

// class Box <T>{
//   private T value;

//   Box(T value){
//     this.value=value;
//   }

//   public T getValue(){
//     return this.value;
//   }

//   public void setValue(T value){
//     this.value=value;
//   }
// }

public class Generics1{

  static <T extends Animal> void test(T animal){
  animal.eat();
}


   public static void main(String[] args) {



    Animal a=new Animal();
    Dog d=new Dog();

    test(a);
    test(d);


  }
}

/**
 * InnerGenerics1
 */


 class Animal {

  void eat(){
    System.out.println("Animal is eating");
  }

}

class Dog extends Animal{
  void bark(){
    System.out.println("Dog is ");
  }
}

