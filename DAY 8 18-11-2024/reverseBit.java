//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/reverse-bits?page=2&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-- > 0){
            int n = s.nextInt();
            System.out.println(revereBits(n));
        }
    }
    public static long revereBits(int n){
        long rev = 0;
        for(int i=0;i<32;i++){
            rev = (rev <<1) | (n & 1);
            n = n>>1;

        }
        return rev & 0xFFFFFFFFL;
    }
}