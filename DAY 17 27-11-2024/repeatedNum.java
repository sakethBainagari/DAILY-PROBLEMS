
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/repeated-numbers?page=3&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

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
            Arrays.sort(a);
            for(int i=0;i<n-1;i++){
                if(a[i] == a[i+1]){
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
    }
}