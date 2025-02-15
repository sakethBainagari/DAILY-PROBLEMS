// Basic problems
//Codechef
//https://www.codechef.com/problems/VACCINE2?tab=statement
import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int d = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }
            int count1 =0;
            int count2 =0;
            for(int i =0 ;i<n;i++){
                if(a[i] >=80 || a[i] <= 9){
                    count1++;
                }else{
                    count2++;
                }
            }
            int count = (int)Math.ceil((double)count1/d) + (int)Math.ceil((double)count2/d);
            System.out.println((int)count);
        }
	}
}
