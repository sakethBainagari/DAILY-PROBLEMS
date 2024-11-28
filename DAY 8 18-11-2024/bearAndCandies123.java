//https://www.codechef.com/problems/CANDY123?tab=statement

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
            int x = 1;
            while(a >=0 && b >= 0){
                if(x % 2 == 1){
                    a = a -x;
                }else{
                    b = b -x;
                }
                x++;
            }
            if(a<0){
                System.out.println("Bob");
            }else{
                System.out.println("Limak");
            }
        }
	}
}
