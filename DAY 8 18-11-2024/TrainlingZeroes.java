// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/trailing-zeros

import java.util.*;

public class TrainlingZeroes {
    public static long trailingZero(long n){
        long count = 0;
        for(long i=5; i<=n; i*=5){  // formula for trailing zeros [n/5] + [n/5^2] + [n/5^3] + .............. 5^k > n ;
            count += n/i;
        }
        return count;

        // using while loop
        // long count = 0 ;
        // while(n >= 5){
        //     count += n/5;
        //     n /= 5;
        // }
        // return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        // WITHOUT USING STRIGBUFFER
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        long[] a = new long[tc];
        for(int t=0;t<tc;t++){
            long n = s.nextLong();
            a[t] = trailingZero(n); 
        }

        for( long i : a){
            System.out.println(i);
        }
    }
}



//=================USING STRING BUFFER====================
// import java.io.*;
// import java.util.*;

// public class Main {
//     public static long trailingZero(long n){
//         long count = 0;
//         for(long i=5; i<=n; i*=5){
//             count += n/i;
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

//         Scanner s = new Scanner(System.in);
//         int tc = s.nextInt();
//         StringBuilder sb = new StringBuilder();
//         for(int t=0;t<tc;t++){
//             long n = s.nextLong();
//             sb.append(trailingZero(n)).append("\n");

//         }

//         System.out.print(sb.toString());


//     }
// }