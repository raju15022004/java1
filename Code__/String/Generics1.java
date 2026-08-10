

public class Generics1 {

  public static void main(String[] args) {

    Box<Integer> b1=new Box<>(10);

System.out.println(b1.getValue() +5);
  }

}

class Box <T>{
  private T value;

  Box(T value){
    this.value=value;
  }

  public T getValue(){
    return this.value;
  }

  public void setValue(T value){
    this.value=value;
  }
}
