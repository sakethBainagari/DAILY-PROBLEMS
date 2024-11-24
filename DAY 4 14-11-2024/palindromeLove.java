import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args)throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0 ){
            int n = sc.nextInt();
            String str1 = sc.next();
            StringBuilder sb = new StringBuilder(str1);
            String revstr1 = sb.reverse().toString();
            if(str1.equals(revstr1)){
                System.out.println(0);
                continue;
            }
            str1 = str1.substring(0,str1.length()-1);
            revstr1 = revstr1.substring(0,revstr1.length()-1);
            
            if(n == 2){
                System.out.println(-1);
                continue;
            }
            
            if(n%2 == 0){
                StringBuilder str2 = new StringBuilder(str1);
                StringBuilder str3 = new StringBuilder(revstr1);
                
                str2.reverse();
                str3.reverse();
                if(str2.toString().equals(str1) && str3.toString().equals(revstr1)){
                    System.out.println(-1);
                    continue;
                }
            }
            System.out.println(1);
        }
	}
}
