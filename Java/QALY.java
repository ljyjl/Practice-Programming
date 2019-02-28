import java.util.*;

public class QALY {
   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      
      int n = 0;
      ArrayList<Double> qualityList = new ArrayList<Double>();
      ArrayList<Double> numList = new ArrayList<Double>();       
      
      n = in.nextInt();
           
      for (int i = 0; i < n; i++) {
         qualityList.add(in.nextDouble());
         numList.add(in.nextDouble());
      } 
      
      double total = 0;
      
      for (int i = 0; i < n; i++) {
         total = total + (qualityList.get(i) * numList.get(i));
      } 
      
      System.out.format("%.3f", total);      
   }
}