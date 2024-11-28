// https://www.codechef.com/problems/CHEFARRP

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for(int t=0;t<tc;t++){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }
            int count = 0;
            for(int i=0;i<n;i++){
                int sum = 0;
                int prod = 1;
                for(int j=i;j<n;j++){
                    sum += a[j];
                    prod *= a[j];
                    if(sum == prod){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
	}
}
