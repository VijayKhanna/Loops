package Problems;
import java.util.Scanner;
public class Problem16 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		int i, j;
		for (i = 0; i < num; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
