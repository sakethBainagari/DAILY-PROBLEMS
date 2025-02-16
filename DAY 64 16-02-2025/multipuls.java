//https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/number-of-multiples?page=5&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n  = s.nextLong();
        long count1 = n/3;
        long count2 = n/5;
        long count3 = n/15;

        System.out.println((long)(count1+count2-count3));
        
    }
}