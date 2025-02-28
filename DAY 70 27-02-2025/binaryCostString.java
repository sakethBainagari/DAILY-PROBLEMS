	//https://www.codechef.com/problems/BSCOST?tab=statement
	
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
	            int x = s.nextInt();
	            int y = s.nextInt();
	            
	            String ss = s.next();
	           if(ss.contains("01") || ss.contains("10")){
	               System.out.println(Math.min(x,y));
	           }else{
	               System.out.println(0);
	           }
	            
	        }
		}
	}
	