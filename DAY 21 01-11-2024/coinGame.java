
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/coin-game?page=1&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            int x = s.nextInt();
            int y = s.nextInt();
            if( (x+y)%3 == 0 && x <= 2*y && y <= 2*x ){
               System.out.println("YES"); 
            }else{
               System.out.println("NO"); 
            }
        }
        
    }
}