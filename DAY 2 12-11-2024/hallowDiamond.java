// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/print-hollow-diamond-pattern

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for(int t=1;t<=tc;t++){
            int size= s.nextInt();
            int n = (int)Math.ceil(size/2.0);
            System.out.println("Case #" + t + ":");
            for(int i=1;i<=n;i++){
                for(int j=n-1;j>=i;j--){
                    System.out.print(" ");
                }

                for(int k=1;k<=2*i-1;k++){
                    if(k==1 || k == 2*i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int i=n-1;i>=1;i--){
                for(int j=n-1;j>=i;j--){
                    System.out.print(" ");
                }

                for(int k=1;k<=2*i-1;k++){
                    if(k==1|| k==2*i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}
}