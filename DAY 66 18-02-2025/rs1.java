import java.io.*;
import java.util.*;

public class Main {
    public static int rearrageSeq(int[] a, int n){
        int ans = 0;
        for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            int max= Integer.MIN_VALUE;

            for(int j=i;j<n;j++){
                min = Math.min(a[j], min);
                max = Math.max(a[j], max);
                if(max-min+1 == j-i+1){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }

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
            System.out.println(rearrageSeq(a,n));
        }
        
    }
}