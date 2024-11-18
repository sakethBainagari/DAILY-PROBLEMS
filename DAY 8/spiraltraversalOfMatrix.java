// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/spiral-traversal-of-matrix?page=0&pageSize=10

import java.util.*;

public class spiraltraversalOfMatrix {
    public static void PrintPattern(int[][] mat , int n){
        int top = 0 , bottom = n-1 , left = 0, right = n-1;
        while(top <= bottom && left <= right){
            // left to right
            for(int i=left ; i<=right;i++){
                System.out.print(mat[top][i] + " ");
            }
            top++;

            //top to bottom from right side of column
            
            for(int i=top ; i<=bottom;i++){
                System.out.print(mat[i][right] + " ");
            }
            right--;

            //right to left bottom row
            if(top <= bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            // bottom to top from left side of column
            if(top <= bottom){
                for(int i=bottom;i>=top;i--){
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int[][] mat = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j] = s.nextInt();
                }
            }

            PrintPattern(mat, n);
            System.out.println();
        }
    }
}