import java.util.*;

public class Bijele {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      
      int[] set = {1, 1, 2, 2, 2, 8};
      int[] nArray = new int[6];
      
      for (int i = 0; i < nArray.length; i++) {
         nArray[i] = input.nextInt();
      }
      
      for (int i = 0; i < nArray.length; i++) {
         System.out.print(set[i] - nArray[i] + " ");
      }     
   }
}