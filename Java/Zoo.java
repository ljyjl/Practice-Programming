import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map;

public class Zoo {
   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int n = Integer.parseInt(in.nextLine());
      int aniC = 0;
      
      while (n != 0) {
         TreeMap<String, Integer> animals = new TreeMap<String, Integer>();
         
         for (int i = 0; i < n; i++) {
            String inp = in.nextLine();
            String[] inpSplit = inp.split(" ");
            String animal = inpSplit[inpSplit.length - 1].toLowerCase();
            
            if(animals.containsKey(animal)) {
               int oldValue = animals.get(animal);
               animals.put(animal, oldValue + 1);
            }
            else {
               animals.put(animal, 1);
            }
         }
         
         System.out.println("List " + ++aniC + ":");
         
         for (String animalType: animals.keySet()) {
            System.out.println(animalType + " | " + animals.get(animalType));
         }
           
         n = Integer.parseInt(in.nextLine());
      }
   }
}