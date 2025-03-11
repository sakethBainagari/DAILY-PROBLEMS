//Arrays
// https://www.codechef.com/problems/MOOCHEF?tab=statement

import java.lang.*;
import java.util.*;

class moodyChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int tc=s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int l = s.nextInt();
            int r = s.nextInt();
            int happi = 0;
            int mini = 0;
            int maxi = 0;
            
            for(int i=0;i<n;i++){
                int num = s.nextInt();
                if(num>=l && num<=r){
                    happi++;
                }else{
                    happi--;
                }
                
                mini = Math.min(mini,happi);
                maxi = Math.max(maxi,happi);
            }
            System.out.println(maxi + " "+ mini);
            
        }
        
      
	}
}
