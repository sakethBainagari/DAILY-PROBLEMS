// https://www.hackerrank.com/challenges/array-left-rotation/problem
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int r = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int i=1;i<=r;i++){
            int a  = arr[0];
            for(int j =0 ;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = a;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
        
    }
}
