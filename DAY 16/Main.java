
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/tower-of-hanoi?page=0&pageSize=10&search=tower
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            System.out.println((int)(Math.pow(2,n) - 1));
            TOH(n,'A','C','B');
        }
    }
    static void TOH(int n,char src,char dest,char temp){
        if(n==0) return;
        TOH(n-1,src, temp, dest);
        System.out.println("Move " + n + " from " + src + " to " + dest);
        TOH(n-1,temp,dest,src);
    }
}