// Generating random number using java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class Geeks{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you think is the product?: ");
        int prediction = input.nextInt();
               
        // Creating the instance of Random class
        Random r= new Random();

        // Generate random integers in range 0 to 999
        int r1 = r.nextInt(4);
        int r2 = r.nextInt(4);

        // Printing random integers
        System.out.println("Random Integers: " + r1);
        System.out.println("Random Integers: " + r2);
        int answer = r1 * r2;
        if (prediction == answer) {
         System.out.println("You are correct");
        }
        else {
        System.out.println("You are wrong");

        }


    }
}