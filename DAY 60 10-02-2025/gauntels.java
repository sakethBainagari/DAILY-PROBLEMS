
//https://hive.smartinterviews.in/contests/mlrit-2026-phase-1-ic2/problems/gauntlets?page=0&pageSize=10
import java.io.*;
import java.util.*;

public class gauntels {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();

        }
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1] && a[i]>-1 ){
                count++;
                a[i] = -1;
                a[i+1]= -1;
            }

        }
        System.out.println(count);
        
    }
}