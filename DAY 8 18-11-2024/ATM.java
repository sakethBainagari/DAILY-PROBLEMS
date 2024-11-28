//https://www.codechef.com/problems/ATM2

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
        while(tc-- > 0){
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
            
            for(int i=0;i<n;i++){
                if(arr[i] <= k ){
                    System.out.print("1");
                    k = k -arr[i];
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
            
            
        }
	}
}
