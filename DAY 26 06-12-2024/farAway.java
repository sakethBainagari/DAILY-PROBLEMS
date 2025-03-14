//https://www.codechef.com/problems/FARAWAY?tab=statement

import java.lang.*;
import java.util.*;

class farAway
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            long m = s.nextInt();
            int[] a = new int[n];
            long dist = 0;
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
                if(a[i] <= m/2){
                    dist +=Math.abs(m-a[i]);
                }else if(a[i] > m/2){
                    dist += Math.abs(a[i] - 1);
                }
            }
            System.out.println(dist);
            
        }
	}
}
