package Problems;
import java.util.Scanner;
public class Problem4 
{
	public static void main(String args[])
	{
		String c1,c2;
		Scanner sc= new Scanner(System.in);
		c1=sc.next();
		c2=sc.next();
		if(c1>c2)
		{
			System.out.println(c2+c1);
		}
		else
		{
			System.out.println(c1+c2);
		}
	}

}
