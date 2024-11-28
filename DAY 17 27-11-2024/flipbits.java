
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/flip-bits?page=2&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            int count = 0;
            int ans = a ^ b;
            for(int i=0;i<32;i++){
                if((ans & (1<<i)) !=0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}