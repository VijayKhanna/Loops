package Problems;
import java.util.Scanner;
public class Problem15 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int num,sum=0,r;
		num=sc.nextInt();
		while(num!=0) {
			r=num%10;
			sum+=r;
			num=num/10;
		}
		System.out.println(sum);
	}
}
