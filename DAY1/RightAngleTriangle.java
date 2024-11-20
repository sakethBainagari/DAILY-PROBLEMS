// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/print-right-angled-triangle-pattern

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=1;i<=t;i++){
            int n = s.nextInt();
            System.out.println("Case #"+ i + ":");
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n-j;k++){
                    System.out.print(" ");
                }
                for(int k=1;k<=j;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}