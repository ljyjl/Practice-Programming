import java.util.*;

public class StuckInATimeLoop {
   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
   
      int n = in.nextInt();
   
      for (int i = 0; i < n; i++) {
         int num = i + 1;
         System.out.println(num + " Abracadabra");
      }
   }
}