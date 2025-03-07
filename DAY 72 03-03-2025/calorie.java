//https://www.codechef.com/problems/CALLIM?tab=statement
import java.lang.*;
import java.util.*;
class calorie
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s  = new Scanner(System.in);
		int tc  = s.nextInt();
		while(tc-->0){
		    int n = s.nextInt();
		    int k = s.nextInt();
		    int sum = 0;
		    int count = 0;
		    for(int i=0;i<n;i++){
		        int a = s.nextInt();
		        sum +=a;
		        if(sum<=k){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
