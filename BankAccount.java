// Each BankAccount object represents one user's account
// information including name and balance of money.
public class BankAccount {
  String name;
  double balance;

  public BankAccount(String name, double balance){
    this.name = name;
    this.balance = balance;
  }

  public void deposit(double amount) {
    balance = balance + amount;
  }

  public void withdraw(double amount) {
    balance = balance - amount - 1;
    if(balance <=0 ){
      balance = balance - 1;
    }
  }

    public String toString(){
      return name + ", $" +String.format("%.2f", balance);
    }
    public void transfer(BankAccount other, double amount) {
      if (amount <= 0 || balance < 5) { 
          return;  
      }
  
      double totalDeduction = amount + 5;
  
      if (balance >= totalDeduction) {  
          balance -= totalDeduction;  
          other.balance += amount;  
      } else {  
          double transferableAmount = balance - 5; 
  
          if (transferableAmount > 0) {  
              balance -= (transferableAmount + 5);  
              other.balance += transferableAmount;  
          }
      }
  }
  }




