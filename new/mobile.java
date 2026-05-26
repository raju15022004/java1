
// Define a class called mobile with the following description:
// Instance variable/data members:
// String bno-to store the bike's number(up65AB1234)
// String name-to store the name of the customer
// int days - to store the number of days the bike is taken on rent
// int charge - to calculate and store the rental charge
// member methods:
// void intput ( ) - to input and store the detail of the customer.
// void computer ( ) - to computer the rental charge the rent for a mobile is charge on the following basis.
// First five day RS 500 per day:
// Next five days RS 400 per day:
// Rest of the days Rs 200 per day
// void display ( ) - to display the details in the following fornmat:
// Bike No. name No. of days charge

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public  class mobile{
  String bno;
  String name;
  int days;
  int charge;
  void input(){
    System.out.println("Enter the Bike number");
    bno=new java.util.Scanner(System.in).nextLine();
    System.out.println("Enter the Customer Name");
    name=new java.util.Scanner(System.in).nextLine();
   System.out.println("Enter the no of days");
   days=new java.util.Scanner(System.in).nextInt();
  }
  void computer(){
    if(days<=5){
      charge=500*days;
    }

    else if(days>5 && days<=10){
      charge=2500+400*(days-5);
    }
    else if(days>10){
      charge=2500+2000+200*(days-10);
    }
  }
  void display(){

  System.out.print("Bike no"+"\t"+"Customer name"+"\t"+"Days"+"\t"+"Charge");
  System.out.println("   ");
  System.out.println(bno+"\t");
  System.out.println(name+"\t\t");
  System.out.println(days+"\t");
  System.out.println(charge+"\t");
  }
  public static void main(String[] args) {
      mobile m1=new mobile();
      m1.input();
      m1.computer();
      m1.display();
  }
}
