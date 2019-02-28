import java.util.*;

public class everywhere {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
   
      int n = Integer.parseInt(in.nextLine());
   		
      for (int i = 0; i < n; i++) {
         HashSet<String> set = new HashSet<String>();
         int n2 = Integer.parseInt(in.nextLine());
      
         for (int j = 0; j < n2; j++) {
            set.add(in.nextLine());
         }
         System.out.println(set.size());
      }
   }
}

	
