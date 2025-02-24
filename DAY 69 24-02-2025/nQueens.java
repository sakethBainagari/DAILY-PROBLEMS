
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/n-queens?page=4&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static boolean isSafe(int row, int col, int[][] board,int n){
        for(int i=row;i>=0;i--){
            if(board[i][col]==1){
                return false;
            }
        }

        for(int i=col-1;i>=0;i--){
            if(board[row][i]==1){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }

    public static void genAll(int[][] board, int row,int n){
        if(row == n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }


        for(int j=0;j<n;j++){
            if(isSafe(row,j,board,n)){
                board[row][j] = 1;
                genAll(board,row+1,n);
                board[row][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
           int n = s.nextInt();
           if(n==1){
            System.out.println("1");
            continue;
           }

           if(n<4){
            System.out.println("-1");
            continue;
           }


           int[][] board = new int[n][n];
           genAll(board,0,n);
           System.out.println();
        }
    }
}