import java.util.Arrays;

public class Sorter {
   public static void main(String[] args) {
      int[] set = {4, 2, 3, 4, 5};
      System.out.println(Arrays.toString(set));
      
      int max = set[0];  // start with the first element
      int min = set[-1];
      
      for(int i = 0; i < set.length; i++) {
         System.out.println(set[i]);  // prints each element
         
         if(set[i] > max) {
            max = set[i];  // update max if current element is bigger
         else if (set < min[i]) {
               min = set[i];
               }
         }
            
         }
      }
      
      System.out.println("Largest number is: " + max + min);  // print final result
   }
}
