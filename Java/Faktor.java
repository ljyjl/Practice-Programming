import java.util.*;

public class Faktor {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);

		int publish = in.nextInt();
		int factor = in.nextInt();

		int scientists = publish * (factor - 1) + 1;

		System.out.println(scientists);
	}
}
