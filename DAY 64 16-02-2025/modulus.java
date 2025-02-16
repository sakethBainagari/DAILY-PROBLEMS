//https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/applying-modulus?page=5&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long MOD = 1000000007;
        long[] a = new long[6];
        for(int i=0;i<6;i++){
            a[i] = s.nextLong();
        }

    long p1 = (((a[0]%MOD)*(a[1]%MOD))%MOD *(a[2]%MOD))%MOD;
    long p2 = (((a[3]%MOD)*(a[4]%MOD))%MOD *(a[5]%MOD))%MOD;    
    long ans = (p1-p2+MOD)%MOD;
    System.out.println((long)ans);

    }
}