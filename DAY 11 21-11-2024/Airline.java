
// https://www.codechef.com/problems/AIRLINE

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
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    int d = s.nextInt();
		    int e = s.nextInt();
		    if((a+b)<=d && c<=e  || (a+c)<=d && b<=e || (b+c)<=d && a<=e) {
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
