

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
        while(tc-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            
            int count = 0;
            for(int i=0;i<n-1;i++){
                if(a[i] != a[i+1]){
                    count++;
                }
            }
            System.out.println(count+1);
        }
	}
}
