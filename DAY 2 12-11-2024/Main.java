// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/sum-of-array-elements?page=0&pageSize=10

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for(int t=0;t<tc;t++){
            int n =s.nextInt();
            long sum=0;
            for(int i=0;i<n;i++){
                sum += s.nextLong();
            }
            System.out.println(sum);
        }
    }
}