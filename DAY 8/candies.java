// https://www.codechef.com/problems/CNDY?tab=statement

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
        while(tc-- > 0 ){
            int n = s.nextInt();
            int[] a = new int[2*n];
            for(int i=0;i<2*n;i++){
                a[i] = s.nextInt();
            }
            int count = 0;
            int len = 0;
            for(int i=0;i<2*n;i++) {
                count = 0;
                for(int j=0;j<2*n;j++){
                    if(a[i] == a[j]){
                        count++;
                    }
                }
                if(count > 2){
                    System.out.println("No");
                    break;
                }else{
                    len++;
                }
                
            }
            if( len == 2*n){
                System.out.println("Yes");
            }
        }
	}
}
