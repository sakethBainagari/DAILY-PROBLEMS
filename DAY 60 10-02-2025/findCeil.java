//https://hive.smartinterviews.in/contests/mlrit-2026-phase-1-ic2/problems/finding-the-ceil-ic?page=0&pageSize=10
import java.io.*;
import java.util.*;

public class Main {
    public static int findceil(int p, int[] a , int low, int high){
        int ceil = Integer.MAX_VALUE;   // floor = Integer.MIN_VALUE
        while(low<=high){
            int mid = low +(high-low)/2;
            if(p == a[mid]){
                return a[mid];
            }else if(p > a[mid]){ // for floor p<a[mid]  high = mid-1
                low = mid+1;
            }else{
                ceil = a[mid];      // floor = a[mid]
                high=mid-1;         // low mid+1
            }
        }
        return ceil;               // return floor
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        int q = s.nextInt();
        for(int i=0;i<q;i++){
            int p = s.nextInt();
            System.out.println(findceil(p,a,0,n-1));
        }
    }
}