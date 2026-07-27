// package java.ENUM;

enum Week{
  Monday,Tuesday,Wednesday,Thursday,Friday,Saturaday,Sunday;

}

public class Defaultvalue {

  public static void main(String[] args) {

    System.out.println("Here are all week constants" + "and their ordinal values:");

    Week day1[]=Week.values();
    for(int i=0;i<day1.length;i++){
      System.out.println(day1[i]+"=");
      System.out.println(day1[i].ordinal());
    }
    for(Week day : Week.values()){
      System.out.println(day + " " + day.ordinal());
    }

  }

}
