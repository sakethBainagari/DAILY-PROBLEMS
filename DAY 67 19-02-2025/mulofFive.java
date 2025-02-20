//https://www.codechef.com/problems/DIGARR

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
            String ss = s.next();
            if(ss.contains("0") || ss.contains("5")){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
	}
}
