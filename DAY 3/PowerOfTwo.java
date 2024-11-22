//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/power-of-2?page=1&pageSize=10

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for(int t=0;t<tc;t++){
            long n = s.nextLong();
            if((n&(n-1)) == 0){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
}