import java.util.*;

//MPLERSN

public class Mosquitos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m, p, l, e, r, s, n;
         
        while (in.hasNext()) {
            m = in.nextInt();
            p = in.nextInt();
            l = in.nextInt();
            e = in.nextInt();
            r = in.nextInt();
            s = in.nextInt();
            n = in.nextInt();
               
                for(int i = 1; i < n; i ++) {
                    int temp = p;
                    p = l / r;
                    l = e * m;
                    m = temp / s;
                }
            System.out.println(m);
        }
    }
}