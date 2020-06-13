package Problems;

public class Problem13 {
public static void main(String args[])
{
	int s=10,e=99;
    while (s<e)
    {
    boolean flag = false;
    for(int i=2;i<=s/2;i++) 
    {
            if(s%i == 0) 
            {
                flag = true;
                break;
            }
        }
        if (!flag && s!= 0 && s != 1)
        System.out.print(s+ " ");
        s++;
    }
}
}
