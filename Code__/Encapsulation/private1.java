// package Code__.Encapsulation;

public class private1 {

  public static void main(String[] args) {

    BankAccount ba =new BankAccount();
    ba.deposit(500);
    ba.withdraw(500);

    System.out.println(ba.getBalance());

  }
}


class BankAccount{
  private double balance;

  public void deposit(int amount){
    balance +=amount;
  }


public void withdraw(int amount){
  balance -=amount;

}

public double getBalance(){
  return balance;
}
}
