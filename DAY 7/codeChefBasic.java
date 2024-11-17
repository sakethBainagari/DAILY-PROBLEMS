//https://www.codechef.com/problems/ZCOSCH
import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>=1 &&n<=50){
            System.out.println("100");
        }else if(n>=51 && n<=100){
            System.out.println("50");
        }else{
            System.out.println("0");
        }
	}
}
