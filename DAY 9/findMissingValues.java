//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/finding-missing-number?page=2&pageSize=10

import java.util.*;

public class findMissingValues {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n =s.nextInt();
            int totalSum = ((n+1)*(n+2))/2;
            int sum = 0;
            for(int i=0;i<n;i++){
                sum += s.nextInt();
            }

            int missNum = totalSum - sum ;
            System.out.println(missNum);

        }
    }
}