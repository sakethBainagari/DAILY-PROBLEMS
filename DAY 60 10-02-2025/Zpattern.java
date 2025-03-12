//https://hive.smartinterviews.in/contests/mlrit-2026-phase-1-ic2/problems/z-pattern-ic?page=0&pageSize=10

import java.util.*;

public class Zpattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for(int t=1;t<=tc;t++){
            System.out.println("Case "+"#"+t+":");
            System.out.println();
            int n = s.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1 || i==n || i==n-j+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}