import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      bankAccount account1 = new bankAccount(2300);
      System.out.print("What operation would you like to do? 1 : Deposit funds into the account | 2: Withdraw funds from the account : ");
      String choice = sc.nextLine();
      if(choice.equals("1")) {
         System.out.print("How much would you like to deposit?: ");
         double depositAmount = sc.nextInt();
         account1.deposit(depositAmount);
         System.out.print(account1.checkBalance());
      }
      else if(choice.equals("2")) {
         System.out.print("How much would you like to withdraw?: ");
         double withdrawAmount = sc.nextInt();
         account1.withdraw(withdrawAmount);
         System.out.printf("You have withdrawn %d. You have %d in your bank account.", withdrawAmount, account1.checkBalance());

      }
      sc.close();
   }
}
class bankAccount {
   private double balance;
   
   
   public bankAccount(double balance) {
   this.balance = balance;
   
   }
   
   
   public double deposit(double value) {
   return balance += value;
   }
   public double withdraw(double value) {
   if(value > balance) {
      return -1;
   }
   if (value > 400) {
      System.out.print("You cannot withdraw more than 400");
   }
   return balance -= value;
   
   }
   
   public double checkBalance() {
      return balance;
   }
}