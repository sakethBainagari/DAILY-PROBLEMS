//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/triple-trouble?page=0&pageSize=10&search=triple

import java.io.*;
import java.util.*;

public class Main {
    static boolean checkBit(int a , int bit){
        return ((a>>bit)&1)==1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }
            int ans = 0;
            for(int bit =0;bit<32;bit++){
                int count = 0;
                for(int i=0;i<n;i++){
                    if(checkBit(a[i],bit)){
                        count++;
                    }
                }
                if(count % 3 != 0){
                    ans = ans | (1<<bit);
                }
            }
            System.out.println(ans);
        }
    }
}