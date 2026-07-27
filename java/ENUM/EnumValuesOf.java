// package java.ENUM;

enum Week{
   Monday,Tuesday,Wednesday,Thursday,Friday,Satursday,Sunday
}


public class EnumValuesOf {

  public static void main(String[] args) {
      Week day;
      day=Week.valueOf("Monday");
      System.out.println("day contains " + day);
      day=Week.valueOf("Tuesday");
      System.out.println("day contains " +day);
  }

}
