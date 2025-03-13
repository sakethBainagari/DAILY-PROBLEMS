//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/triplet-with-sum-k
import java.io.*;
import java.util.*;

public class tripletswithK {
    public static boolean findtriplet(int[] arr, int n,int k){
        for(int i=0;i<n-2;i++){
            int left = i+1,right =n-1;
            while(left<right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum==k){
                    return true;
                }else if(sum < k){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }

            Arrays.sort(arr);
            boolean result = findtriplet(arr,n,k);
            System.out.println(result);
        }
    }
}