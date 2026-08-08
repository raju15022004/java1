public class interface1{

  public static void main(String[] args){
    Car c=new Thar();
    c.drive();

  }

}

/**
 * interface
 */
 interface  Car  {

  void drive();


}

class Thar implements Car{
  @Override

  public void drive(){
    System.out.println("Thar is driving");
  }
}
