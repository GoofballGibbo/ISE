import java.util.*;
public class Checkr1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int randomnum = (int)(Math.random() * 101);
   
      int choice = 10;
      int previousguess = 0;
      String state = "none";
     
   
   while(choice > 0) {
      System.out.print("Guess a number: ");
      

      int guess = sc.nextInt();
         if (guess > randomnum) {
            System.out.print("Too high!");
            if (state.equals( "high")) {
               System.out.print("Come on, pay attention dude!");

               
            }
         state = "high";
               
      } else if (guess < randomnum) {
         System.out.print("Too low!");
         if (state.equals( "low")) {
               System.out.print("Come on, pay attention dude!");

               
            }
         state = "low";

      } else if (guess == randomnum) {
         System.out.print("Correct!");
         break;
      }
      previousguess = guess;
      choice --;
   
  
   }
      sc.close();
  }
     
}