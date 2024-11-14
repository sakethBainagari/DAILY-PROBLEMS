import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int man = Integer.MIN_VALUE;
		    int idx = -1;
		    for(int i=0;i<22;i++)
		    {
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        b = b*20;
		       int score = a+b;
		        if(score >= man)
		        {
		            man = score;
		            idx = i+1;
		        }
		    }
		    System.out.println(idx);
		    
		}
	}
}
