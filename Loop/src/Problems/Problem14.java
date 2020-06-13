package Problems;
import java.util.Scanner;
public class Problem14
{
	public static void main(String args[])
	{
		int num,c=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				c++;
			}
			else {
				c=0;
			}
		}
		if(c!=0)
		{
			System.out.println("composite");
		}
		else
		{
			System.out.println("Prime");
		}
		
	}

}
