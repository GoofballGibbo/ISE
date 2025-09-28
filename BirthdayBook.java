import java.util.HashMap;

public class BirthdayBook {
   public static void main(String[] args) {
   HashMap <String, String> birthdays = new HashMap<>();
   
   birthdays.put("Alice", "Jan 5");
   
   birthdays.put("Bob", "Feb 20");
   
   
   birthdays.put("Alice", "Jan 6");
   
   birthdays.put("Charlie", "Mar 15");
   
   System.out.println("Alice's birthday is: " + birthdays.get("Alice"));
   // Printing Alice's birthday from the birthdays HashMap
   
   System.out.println("All birthdays: " + birthdays);
   // Printing all the birthdays
   
   if (birthdays.containsKey("David")) {
      System.out.println("David's birthday is: " + birthdays.get("David"));
      // If the key(David) exists, it will execute this command
   } else {
      System.out.println("David not found.");
   
   }
   
   
   } 
   
}