
//https://www.codechef.com/problems/MAGICHF?tab=statement
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int x = s.nextInt();
            int ss = s.nextInt();
            int a,b,coin=x;
            for(int i=0;i<ss;i++){
                a = s.nextInt();
                b = s.nextInt();
                
                if(coin == a){
                    coin = b;
                }else if(coin==b){
                    coin = a;
                }
            }
            System.out.println(coin);
        }
	}
}
