import java.util.*;

public class TwoStones {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      int n = in.nextInt();
      
      if (n % 2 == 0) {
         System.out.println("Bob");
      }
      else {
         System.out.println("Alice");
      }  
   }
}