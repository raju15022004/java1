// package java.ENUM;

enum Week{
  Monday,Tuesday,Wednesday,Thursday,Friday,Satursday,Sunday
}

public class EnumValues {

  public static void main(String[] args) {
      System.out.println("Here are all Week constants");


      Week allWeek[]=Week.values();
      for(Week aday : allWeek){
        System.out.println(aday);
      }

      for(int i=0;i<allWeek.length;i++){
        System.out.println("allWeek");
      }
  }
}
