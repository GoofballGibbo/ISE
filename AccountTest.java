import java.util.*;

public class AccountTest {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      Account account = new Account();
      
      System.out.printf("Initial name is: %s%n%n", account.getName());
      
      System.out.println("Enter the name: ");
      String theName = sc.nextLine();
      account.setName(theName);
      System.out.println();
      
      System.out.printf("Name in object is: %s%n%n", account.getName());
      
      
   }
}
class Account {
   private String name;
   
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
}