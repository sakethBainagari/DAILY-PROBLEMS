//https://www.codechef.com/problems/NEWPIECE?tab=statement

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
            int a = s.nextInt();
            int b = s.nextInt();
            int p = s.nextInt();
            int q = s.nextInt();
           if((a==p) && (b==q)){
               System.out.println("0");
           }else{
               if((a+b+p+q)%2 == 0){
                   System.out.println("2");
               }else{
                   System.out.println("1");
               }
           }
        }
	}
}
