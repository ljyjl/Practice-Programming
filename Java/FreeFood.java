import java.util.*;

public class FreeFood {
   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      
      int n = Integer.parseInt(in.nextLine());
      Set<Integer> days = new TreeSet<Integer>();
      
      for (int i = 0; i < n; i++) {
         int day1 = in.nextInt();
         int day2 = in.nextInt();
         
         for (int j = day1; j <= day2; j++) {
            days.add(j);
         }
      }
      System.out.println(days.size());
   }
}