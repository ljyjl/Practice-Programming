import java.util.*;

public class DetailedDifference {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      int n = Integer.parseInt(in.nextLine());
         
      for (int i = 0; i < n; i++) {
         String line1 = in.nextLine();
         String line2 = in.nextLine();
         System.out.println(line1);
         System.out.println(line2);
         char[] lineChar1 = line1.toCharArray();
         char[] lineChar2 = line2.toCharArray();
      
         for(int j = 0; j < lineChar1.length; j++) {
            if (lineChar1[j] == lineChar2[j]) {
               System.out.print(".");
            }
            else {
               System.out.print("*");
            }
         }
         System.out.println();
         System.out.println();
      }
      
   }
   
   
}