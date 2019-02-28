import java.util.*;

public class NoDuplicate {
   public static void main(String[] args) {
      HashSet<String> hashSet = new HashSet<String>();
      Scanner in = new Scanner(System.in);
      String line = in.nextLine();
      String[] lineSplit = line.split(" ");
      
      for(String each: lineSplit) {
         if (hashSet.add(each)) {
            continue;
         }
         else {
            System.out.print("no");
            return;
         }
      }
      System.out.print("yes");
   }
}