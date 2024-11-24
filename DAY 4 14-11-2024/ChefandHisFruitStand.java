import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int x = s.nextInt();
            int y = s.nextInt();
            if(x/2 >= y){
                System.out.println(y);
            }else if(x/2 <=y){
                System.out.println(x/2);
            }
            
        }
	}
}
