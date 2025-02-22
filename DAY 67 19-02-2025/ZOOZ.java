//strings
//https://www.codechef.com/problems/ZOOZ?tab=statement
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            for(int i=0;i<n;i++){
                if(i==0||i==n-1){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
	}
}
