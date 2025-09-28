import java.util.*;

public class DinoMealPlanner {
   public static void main(String[] args) {
   int weight = 2000;
   double feedAmount = weight * 0.05;
   int numberFeeds = 2;
   double totalFeed = feedAmount * numberFeeds;
   
   System.out.printf("Our %d kg dinosaur needs to eat %.0f kg daily, which means we need to serve %.0f kg per feeding.", weight, totalFeed, feedAmount);
   
   }

}