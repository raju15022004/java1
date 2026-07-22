class Vargs1 {

  static void show(Object...  x) {

    for(int i=0;i<x.length;i++)
      System.out.println(x[i]+"   ");

  }

  public static void main(String[] args) {
      int day=1;
      String month="april";
      int year=2014;
      show();
      show(day);
      show(day,month);
      show(day,month,year);
      Object  Dateinfo[]={day,month,year};
      show(Dateinfo);
      show((Object)Dateinfo);
      show(new Object[] {Dateinfo});

  }

}
