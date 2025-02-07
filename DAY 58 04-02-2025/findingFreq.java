//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/finding-frequency?page=6&pageSize=10
////
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        long[] a = new long[n];
        Map<Long, Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            a[i] = s.nextLong();
            freq.put(a[i], freq.getOrDefault(a[i],0)+1);  
        }
        int nofq = s.nextInt();
        for(int i=0;i<nofq;i++){
            long q = s.nextLong();
            if(freq.containsKey(q)){
                System.out.println(freq.get(q)) ;
            }else{
                System.out.println("0");
            }
        }

    }
}