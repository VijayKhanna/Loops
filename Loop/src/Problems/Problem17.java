package Problems;
import java.util.Scanner;
public class Problem17 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num,rev=0;
		num=sc.nextInt();
		while(num!=0)
		{
			int r=num%10;
			rev=(rev*10)+r;
			num/=10;
		}
		System.out.println(" "+rev);
	}
}
