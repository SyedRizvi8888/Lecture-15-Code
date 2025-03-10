/*
 * Syed Rizvi
 * It CS 142
 */
public class Lecture15 {

    public static void main(String[] args) {
      System.out.println();
      System.out.println("Hello, world!");
      // SELF-CHECK PROBLEMS:
      // Note: you will need to put some of your answers inside a comments
  
      // Put your answer for #18 here: 
      /*
      The main issue I can spot here is that these varaibles should be put into the feild 
      Also they fail the spell the variable right of intialX
      */
        
      // Put your answer for #19 here:
      name name = new name("Syed",'H',"Rizvi");
      System.out.println(name.normalOrder());
  
      // Put your answer for #20 here:
      /*
       * The this keyword is used to estblish that specfic variable in that class 
       * You dont need to establish a variables in some methods as this does that
       * call other methods of the same object
       */
  
      // Put your answer for #21 here:
      Point p = new Point(5, 6);
      System.out.println(p);

      // Put your answer for #23 here:
        // Private is only avaible in that class while public is avaible across all of them
  
      // Put your answer for #24 here:
      // You can acess it using another key variable like this into another method and now u can acess it everywherre
      // like this this.privateVar = Var
  
      // Put your answer for #25 here:
      Point changePoint = new Point(7, 1);
      System.out.println(changePoint.setX(4));
      System.out.println(changePoint.setY(9));
      // Put your answer for #26 here:
        // U have to look in the name class answer
      // Put your answer for #27 here:
      // look at name for changes
      // Put your answer for #28 here:
      // encapsulation changes the way of hiding data
      // EXERCISES:
  
      // Put your answer for #11 here:
      BankAccount bankAccount = new BankAccount("Yana", 3.03);
      bankAccount.withdraw(1);
      // You will need to add the method in BankAccount.java,
      // and then create objects here to use (test) them
  
      // Put your answer for #12 here:
      bankAccount.toString();
      System.out.println(bankAccount);
  
      // Put your answer for #13 here:
      
      BankAccount ben = new BankAccount("ben",0);
      ben.deposit(80);
      BankAccount hal = new BankAccount("hal", 0);    
      hal.deposit(20.06);
      ben.transfer (hal, 20.00); // ben $55, hal $40 (ben -$25, hal +$20) 
      System.out.println(ben);
      ben.transfer (hal, 10.00); // ben $40, hal $50 (ben -$15, hal +$10) 
      System.out.println(ben);
      hal.transfer (ben, 60.00); // ben $85, hal $0 (ben +45, hal -$50)
      System.out.println(hal);
      System.out.println(ben);
      
    }
  }
  