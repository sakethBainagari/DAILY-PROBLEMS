//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/x-1s-and-y-0s?page=2&pageSize=10

import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int x = s.nextInt();
            int y = s.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<x;i++){
                sb.append('1');
            }
            for(int i=0;i<y;i++){
                sb.append('0');
            }
            String str = sb.toString();
            BigInteger n = new BigInteger(str,2);
            System.out.println(n);
        }
    }
}