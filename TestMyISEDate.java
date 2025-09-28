import java.time.*;
import java.time.LocalDate;
import java.time.temporal.*;
public class TestMyISEDate {
    public static void main(String[] args) {
    
        LocalDate today = LocalDate.now();
        // Using parameterized constructor
        MyISEDate date1 = new MyISEDate(11, 9, 2025);
        date1.displayDate();  // Output: 11-09-2025

        // Using default constructor (current date)
        MyISEDate date2 = new MyISEDate();
        date2.displayDate();  // Output: current system date

        date1.displayNumberOfDay();

        // Using setters
        date2.setYear(2025);
        date2.setMonth(2);
        date2.setDay(29);
       
    
        System.out.println("Updated date:");
        date2.displayDate();  // Output: 01-01-2000
    }
}

class MyISEDate {
   private int day;
   private int month;
   private int year;
   
   public MyISEDate() {
      LocalDate obj = LocalDate.now();
      day = obj.getDayOfMonth();
      month = obj.getMonth().getValue();
      year = obj.getYear();
   }
   
   public MyISEDate(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   public void setDay(int day ) {
      Month month_int = Month.of(month);
      Year checkyear = Year.of(year);
      
      if(month_int.length(checkyear.isLeap())<day|| day<1)
      System.out.print("Invalid Day \n");
      
      else
      this.day = day;
   }
   
   public int getDay() {
      return day;
   }
   
   public void setMonth(int month ) {
      try {
         Month month_int = Month.of(month);
         this.month = month;
      } catch (Exception e) {
         System.out.print("Invalid month \n");
      } 
   }
   
   public int getMonth() {
      return month;
   }
   public void setYear(int year) {
      try {
         Year year_int = Year.of(year);
         this.year = year;
      } catch (Exception e) {
         System.out.print("Invalid year \n");
      } 

   }
   
   
   public int getYear() {
      return year;
   }
   public void displayDate() {
      System.out.printf("%d-%02d-%d\n", this.day, this.month, this.year);
   }
   public void displayNumberOfDay() {
      LocalDate currentDate = LocalDate.now();
      LocalDate saveddate = LocalDate.of(year, month, day);
      long duration = ChronoUnit.DAYS.between(saveddate, currentDate);
      System.out.print(duration+"\n");
   }
   


 }
   
   

