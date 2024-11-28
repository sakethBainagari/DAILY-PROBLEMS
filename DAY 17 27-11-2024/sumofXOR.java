//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/sum-of-xor-of-pairs?page=3&pageSize=10

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }
            long sum = 0;
            for(int i=0;i<32;i++){
                long count=0;
                for(int j=0;j<n;j++){
                    if((a[j] & (1<<i)) == (1<<i)) count++;
                }
                sum += count*(n-count)*(1<<i);
            }
            System.out.println(2*sum);
        }
        
    }
}