package Problems;
import java.util.Scanner;
public class Problem7 
{

	 char ch;
     int temp;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a Character in Lowercase : ");
     ch = sc.next().charAt(0);
     temp = (int) ch;
     temp = temp-32;
     ch = (char) temp;
     System.out.print("Equivalent Character in Uppercase = " +ch);
     char ch1;
     int temp1;
     System.out.print("Enter a Character in Uppercase : ");
     ch1 = sc.next().charAt(0);
     temp1 = (int) ch;
     temp1= temp+32;
     ch1 = (char) temp;
     System.out.print("Equivalent Character in Lowercase = " +ch1);
	
}
