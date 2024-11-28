//https://www.codechef.com/START161D/problems/DONUTSELL

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
            int m = s.nextInt();
            int[] nArr = new int[n];
            int[] mArr = new int[m];
            for(int i=0;i<n;i++){
                nArr[i] = s.nextInt();
            }
            for(int i=0;i<m;i++){
                mArr[i] = s.nextInt();
            }
            int sad = 0;
            for(int i=0;i<m;i++){
                if(nArr[mArr[i] - 1] > 0){
                    nArr[mArr[i] - 1]--;
                }else{
                    sad++;
                }
            }
            System.out.println(sad);
            
        }
	}
}
