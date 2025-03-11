//Arrays
// https://www.codechef.com/problems/WATSCORE
import java.util.*;
import java.lang.*;
import java.io.*;

class thisisMyScore
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int tc  = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[] b = new int[9];
            for(int i=0;i<n;i++){
                int p = sc.nextInt();
                int s = sc.nextInt();
                if(p>=1 && p<=8){
                    b[p] = Math.max(b[p],s);
                }
            }
            int count=0;
            for(int i=1;i<=8;i++){
                count+=b[i];
            }
            System.out.println(count);
        }
	}
}
