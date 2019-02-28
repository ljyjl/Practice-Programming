import java.util.*;

public class DasBlinkenlights {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      int l1 = in.nextInt();
      int l2 = in.nextInt();
      int s = in.nextInt();
      boolean on = false;
      
      for (int i = 1; i <= s; i++) {
         boolean light1, light2;
         
         if (i % l1 == 0) {
            light1 = true;
         } 
         else {
            light1 = false;
         }
         if (i % l2 == 0) {
            light2 = true;
         } 
         else {
            light2 = false;
         }
         
         if (light1 && light2) {
            on = true;
            break;
         }
      }
      
      if(on) {
         System.out.print("yes");
      }
      else {
         System.out.print("no");
      }
   }
}