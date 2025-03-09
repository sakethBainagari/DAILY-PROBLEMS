
//https://www.codechef.com/problems/PROC18A?tab=ide
import java.util.*;
import java.lang.*;
import java.io.*;

class greatRun
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int tc  = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int max =0;
            int sum = 0;
            for(int i =0;i<k;i++){
                sum += a[i];
                
            }
            max = sum;
            
            for(int i=k;i<n;i++){
                sum = sum -a[i-k] + a[i];
                max = Math.max(max,sum);
            }
            
            
            
            
            System.out.println(max);
        }
	}
}
