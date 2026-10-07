// package Pratice Question.variable;

public class swap {

  public static void main(String[] args){

    int a=10;
    int b=20;

    System.out.println("Before swap:");
    System.out.println("a =" + a);
    System.out.println("b ="+ b);


    int team=a;
    a=b;
    b=team;

    System.out.println("After swap:");
    System.out.println("a =" + a);
    System.out.println("b =" + b);
  }

}
