//codechef
// Counting Pretty Numbers
//https://www.codechef.com/problems/NUM239?tab=statement
import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int l = s.nextInt();
            int r = s.nextInt();
            int count = 0;
            for(int i=l;i<=r;i++){
                int n = i%10;
                if(n==2 || n==3||n==9){
                    count++;
                }
            }
            System.out.println(count);
        }
	}
}
