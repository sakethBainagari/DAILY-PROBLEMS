
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/x-and-y-set-bits?page=2&pageSize=10
import java.math.*;
import java.util.*;

public class Main {
    static long power(long x, long y){
        long a=x, res =1;
        int mod = 1000000007;
        while(y!=0){
            if((y&1)==1){
                res = res*a;
                res %=mod;
            }
            a = (a*a)%mod;
            y >>=1;

        }
        return res;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        int mod = 1000000007;
        while(tc-->0){
            long x = s.nextLong();
            long y = s.nextLong();
            if(x==y) System.out.println(power(2,x));
            else{

                long ans = ((((long)power(2,x)%mod))%mod) + ((long)power(2,y)%mod);
                System.out.println(ans%mod);
            }
        }
    }
}

