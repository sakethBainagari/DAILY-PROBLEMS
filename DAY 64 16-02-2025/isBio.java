//https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/is-bitonic-sequence?page=1&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        boolean flag = false;
        int i =0;
        while(i<n-1 && a[i] < a[i+1]){
            i++;
        }
        if(i == 0 || i == n){
            System.out.println(false);
            return;

        }
        

        while(i<n-1 && a[i] > a[i+1]){
            i++;
        }

        flag = (i == n-1);
        System.out.println(flag);
        
    }
}