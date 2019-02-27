import java.util.*;
import java.util.Collections;

public class Zoo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      input.useLocale(Locale.US);
      
      int n = Integer.parseInt(input.nextLine());
      int listC = 0;
                        
      while(n != 0) {
         TreeMap<String, Integer> zooList = new TreeMap<>();
      
         for(int i = 0; i < n; i++) {
            String animalName = last(input.nextLine().split(" ")).toLowerCase();
            zooList.putIfAbsent(animalName, 0);
            zooList.put(animalName, zooList.get(animalName) + 1);
         }
         
         System.out.println("List " + ++listC + ":");
         
         for(Map.Entry<String, Integer> eachEn : zooList.entrySet()) {
            System.out.printf("%s | %d\n", eachEn.getKey(), eachEn.getValue());
         } 
         
         n = Integer.parseInt(input.nextLine());     
      }          
   }
   
   private static String last(String[] arr) {
      return arr[arr.length - 1];
   }
}