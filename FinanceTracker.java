hhhhhhhhyh
import java.util.*;
import java.time.*;
import java.text.DecimalFormat;



public class FinanceTracker {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   ArrayList<Double> expenseList = new ArrayList<>();
   //Creating an array to store values dynamically.
   
   double dailylimit = 50.0;
   HashMap<LocalDate, expenselist> expenses = new HashMap<>();
   
   LocalDate today = LocalDate.now();
   expenses.put(today, 0.0);
   
 
   
   double TodayTotal = expenses.get(today);
   
   double newExpense = 60.0;
   TodayTotal += newExpense;
   
   for(double expense: expenseList) {
      TodayTotal += expense
   
   }
   
   if (TodayTotal > dailylimit) {
      double overlimit = TodayTotal - dailylimit;
      System.out.printf("You've just gone over your limit by %.2f.\n Make sure to be careful next time!", overlimit);
   } 
   
   }

}