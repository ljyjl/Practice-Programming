import java.util.*;

public class SolvingForCarrots {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      String s = in.nextLine();
      String s2[] = s.split(" "); 
      String s3 = s2[s2.length-1];
      
      System.out.print(s3);
   }
}