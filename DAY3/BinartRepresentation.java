// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/binary-representation?page=1&pageSize=10

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for(int t=0;t<tc;t++){
            int  n =s.nextInt();
            int flag = 0;
            for(int i=31;i>=0;i--){
                int k = n>>i;
                if((k&1)==1){
                    flag = 1;
                    System.out.print("1");
                }else if(flag ==1) {
                    System.out.print("0");
                }
            }
            if(flag == 0){
                System.out.print("0");
            }
            System.out.println();

        }
    }
}