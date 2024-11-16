
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/diagonal-traversal-of-matrix
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {

            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for(int i=0; i<n;i++)
            {
                for(int j=0; j<n; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }

            //for upper trangle
            for(int k=n-1; k>=0;k--) //the diagonal count is n
            {
                int sum = 0;
                int j = k;
                for(int i=0; i<=(n-k-1);i++)
                {
                    sum+=(a[i][j]);
                    j++;
                }
                System.out.print(sum+" ");
            }

            // for lower triangle
            for(int k=1; k<n; k++)
            {
                int sum = 0;
                int j = 0;
                for(int i=k; i<=n-1;i++)
                {
                    sum+=(a[i][j]);
                    j++;
                }
                System.out.print(sum+" ");
            }
            System.out.println();
            
        }
    }
	}