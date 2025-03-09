//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/longest-palindromic-substring?page=0&pageSize=10&search=longest

import java.io.*;
import java.util.*;

public class lps {

    public static int LPS(int n, String ss){
        int max_len = 1; // Atleast 1 char is a palindrome

        for(int i=0;i<n;i++){
            int p1 = i;
            int p2 = i+1;
            int len = 0;



            //EVEN
            while(p1>=0 && p2<n && ss.charAt(p1) == ss.charAt(p2)){
                len += 2;
                max_len = Math.max(len,max_len);
                p1--;
                p2++;
            }

            //ODD
            p1 =i-1;
            p2 =i+1;
            len=1;
            while(p1 >= 0 && p2<n && ss.charAt(p1) == ss.charAt(p2)){
                len += 2;
                max_len = Math.max(len,max_len);
                p1--;
                p2++;
            }
        }
        return max_len;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            String ss = s.next();

            System.out.println(LPS(n, ss));
        }
    }
}