// package java.ENUM;

enum Week{
  Monday,Tuesday,Wednesday,Thursday,Friday,Saturaday,Sunday;
}


public class EqualTo {

  public static void main(String[] args) {
      Week day1,day2,day3;
      day1=Week.Monday;
      day2=Week.Monday;
      day3=Week.Friday;

      if(day1.compareTo(day2)<0)
        System.out.println(day1 + "comes before " +day2);

      if(day2.compareTo(day3) > 0)
        System.out.println( day2 + "comes before" + day3);

      if(day1.compareTo(day3) == 0)
        System.out.println(day1 + "equals "+day3);

  }

}
