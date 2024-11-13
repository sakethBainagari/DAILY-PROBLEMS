// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/product-of-2-matrices
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for(int t=0;t<tc;t++){
            int n = s.nextInt();
            int m = s.nextInt();
            int[][] arr1 = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr1[i][j] = s.nextInt();
                }
            }  
            int n1 = s.nextInt();
            int m1 = s.nextInt();
            int[][] arr2 = new int[n1][m1];
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    arr2[i][j] = s.nextInt();
                }
            }  
            int[][] arr3 = new int[n][m1];
            for(int i=0;i<n;i++){
                for(int j=0;j<m1;j++){
                    arr3[i][j] =0;
                    for(int k=0;k<n1;k++){
                        arr3[i][j] += arr1[i][k]* arr2[k][j];
                    }
                    System.out.print(arr3[i][j]+ " ");
                }
                System.out.println();
            }
        }
        
    }
}