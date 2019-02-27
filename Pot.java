import java.util.*;

public class Pot {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      int n = Integer.parseInt(in.nextLine());
      ArrayList<Integer> nums = new ArrayList<Integer>();
      
      for (int i = 0; i < n; i++) {
         nums.add(Integer.parseInt(in.nextLine()));
      }
      
      int total = 0;
      for (int i = 0; i < n; i++) {
         int testVal = nums.get(i);
         int intVal = testVal / 10;
         int expo = testVal % 10;

         total += Math.pow(intVal, expo);
      }
      
      System.out.print(total);
   }
}