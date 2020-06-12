package Problems;
import java.util.Scanner;
public class Problem12 {
public static void main(String args[])
{
	int no,c=0;
	Scanner sc= new Scanner(System.in);
	no=sc.nextInt();
	for(int i=2;i<no;i++)
	{
		if(no%i==0)
		{
			c++;
		}
		else
		{
			c=0;
		}
	}
	if(c==0)
	{
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Composite");
	}
}
}
