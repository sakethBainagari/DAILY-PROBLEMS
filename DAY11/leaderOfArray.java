//https://www.codechef.com/learn/course/arrays/ARRAYS02/problems/DSAAGP11?tab=statement

import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean large = true;
            for(int j=i+1;j<n;j++){
                if(a[j] > a[i]){
                    large = false;
                    break;
                }
                
            }
            if(large){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
	}
}
