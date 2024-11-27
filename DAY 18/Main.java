
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/finding-missing-number?page=2&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
            int totalSum=0;
            for(int i=1;i<=n+1;i++){
                totalSum ^= i;
            }
            int sum = 0;
            for(int num : arr){
                sum ^= num;
            }

            int missNum = totalSum ^ sum;
            System.out.println(missNum);
        }
    }
}