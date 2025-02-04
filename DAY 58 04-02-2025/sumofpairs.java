// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/sum-of-pairs

import java.io.*;
import java.util.*;

public class Main {
    public static boolean findsum(long[] arr, long k){
        int p1=0, p2 = arr.length-1;
        while(p1<p2){
            if(arr[p1] + arr[p2] == k) return true;
            else if(arr[p1] + arr[p2] > k) p2--;
            else if(arr[p1] + arr[p2] < k) p1++;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            long k = s.nextLong();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = s.nextLong();
            }           
            Arrays.sort(arr);
            if(findsum(arr,k)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        
    }
}