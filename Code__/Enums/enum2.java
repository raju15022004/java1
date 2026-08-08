// // package Code__.Enums;

// public class enum2 {

//   public static void main(String[] args) {
//     Direction d=new SouthDirection();
//     d.move();

//   }

// }

// abstract class Direction{
//   public abstract void move();
// }

// class NorthDirection extends Direction{
//   @Override
//   public void move(){
//     System.out.println("Move up (y+1");
//   }
// }

// class SouthDirection extends Direction{
//   @Override
//   public void move(){
//     System.out.println("Move Down (y - 1)");
//   }
// }


public class enum2{

  public static void main(String[] args) {

    Day d=Day.valueOf("friday");

    System.out.println(d);

  }
}

enum Day{
  MONDAY,
  TUESDAY,
  WEDNESDAY;
}
