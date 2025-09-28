import java.util.*;

public class Factor {
   public static void main(String[] args) {
      long num = 60085147143L;
      for(long i = 2; i <= num; i++) {
         if (num % i == 0) {
            if (i % 3 == 0 || i % 2 == 0) {
               System.out.println(i);
            }
         }
         
      }
      
   }
   
}