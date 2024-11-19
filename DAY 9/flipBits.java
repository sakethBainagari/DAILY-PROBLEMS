
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/flip-bits?page=2&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        StringBuilder sb = new StringBuilder();
        while(tc-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            int xor = a ^ b;
            int count =0;
            while(xor != 0){
                xor = xor & (xor -1);
                count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}