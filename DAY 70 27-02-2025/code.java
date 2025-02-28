//https://www.codechef.com/problems/TTENIS?tab=statement
//strings
//code

import java.lang.*;
import java.util.*;

class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            String ss = s.next();
            int count = 0;
            int count0 = 0;
            for(char ch : ss.toCharArray()){
                if(ch == '1'){
                    count++;
                }else{
                    count0++;
                }
            }
            if(count > count0){
                System.out.println("WIN");
            }else{
                System.out.println("LOSE");
            }
        }
	}
}
