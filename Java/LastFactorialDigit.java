import java.util.*;

public class LastFactorialDigit {
   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      
      int n = in.nextInt();
      int load = 1;
      ArrayList<Integer> nList = new ArrayList<Integer>();
      ArrayList<Integer> fList = new ArrayList<Integer>();
      
      for(int i = 0; i < n; i++) {
         nList.add(in.nextInt());
      }
      
      for(int i = 0; i < n; i++) {
         int factorial = nList.get(i);
         while (factorial != 1) {
            load *= factorial;
            factorial--;
         }
         
         if (load <= 10) {
            fList.add(load);
         }
         else {
            fList.add(load % 10);
         }
         load = 1;
      }
      
      for(int i = 0; i < n; i++) {
         System.out.println(fList.get(i));
      }
   }
}