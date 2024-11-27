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
            int swap =0;
            for(int i=0;i<32;i+=2){
                int evenBit = (n>>i) & 1;
                int oddBit = (n>>(i+1) & 1);

                swap = swap | (evenBit << (i+1));
                swap =  swap | (oddBit << i ); 
            }
            System.out.println(swap);
        }
    }
}