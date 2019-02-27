import java.util.*;

public class ICPCAwards {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      int n = Integer.parseInt(in.nextLine());
      String[] univ;
      
      Set<String> univs = new HashSet<String>();
      
      for (int i = 0; i < n && univs.size() < 12; i++) {
         univ = in.nextLine().split(" ");
         String str1 = univ[0];
         String str2 = univ[1];
         if (!univs.contains(str1)) {
            univs.add(str1);
            System.out.println(str1 + " " + str2);
         }
      }  
      
      
   }
}