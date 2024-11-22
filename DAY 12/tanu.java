// https://www.codechef.com/problems/HEADBOB
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
            String str = s.next();
            char[] c = str.toCharArray();
            int countY = 0;
            int countI = 0;
            for(int i=0;i<n;i++){
                if(c[i]  == 'Y'){
                    countY++;
                }else if(c[i] == 'I'){
                    countI++;
                }else{
                    continue;
                }
            }
            if( countY !=0){
                System.out.println("NOT INDIAN");
            }else if(countI !=0){
                System.out.println("INDIAN");
            }else{
                System.out.println("NOT SURE");
            }
        }
	}
}