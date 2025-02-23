
//https://www.codechef.com/problems/PRIMEREVERSE
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
            String a = s.next();
            String b = s.next();
            
            char[] charA = a.toCharArray();
            char[] charB = b.toCharArray();
            Arrays.sort(charA);
            Arrays.sort(charB);
            
            int count = 0;
            for(int i=0;i<n;i++){
                if(charA[i] == charB[i]){
                    count++;
                }
            }
            if(count == n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
	}
}


---------------------------------------------------------------

//ANOTHER APPROACH

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String a = sc.next();
		    String b = sc.next();
		    a = a.replace("1","");
		    b = b.replace("1","");
		    if(a.length()==b.length()){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
