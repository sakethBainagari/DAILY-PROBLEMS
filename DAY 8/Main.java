
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/swap-bits?page=2&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-- > 0){
            int n =s.nextInt();
            int evenMask = 0xAAAAAAAA;
            int oddMask = 0x55555555;
            int even = n & evenMask;
            int odd = n & oddMask;
            even >>=1;
            odd <<=1;
            int res = even |odd;
            System.out.println(res);
        }
    }
}