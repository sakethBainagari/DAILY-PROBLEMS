//https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/factorial-hard?page=5&pageSize=10
import java.io.*;
import java.util.*;

public class FACTORIALhARD {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        int MOD = 1000000007;
        long[] num = new long[n+1];
        num[0] = 1;
        for(int i=1;i<=n;i++){
            num[i] = (num[i-1]*i)%MOD;
        }
        System.out.println(num[n]);
    }
}