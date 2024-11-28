// https://www.codechef.com/problems/TABLET?tab=ide
// dailt streak
import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){}
            int n = s.nextInt();
            int b = s.nextInt();
            int[][] a = new int[n][3];
            int max = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<3;j++){
                    a[i][j] = s.nextInt();
                }
                if((a[i][0]*a[i][1]) > max && (a[i][2] <= b)){
                    max =  a[i][0]*a[i][1];
                }
            }
            if(max == 0){
                System.out.println("no tablet");
            }else{
                System.out.println(max);
                
            }
        }
	}
}
