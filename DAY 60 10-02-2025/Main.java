//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/count-the-triangles
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){ 
                int n = s.nextInt();
                int[] a = new int[n];
                for(int i=0;i<n;i++){
                    a[i] = s.nextInt();
                }
                Arrays.sort(a);
                int count = 0;
                for(int i=2;i<n;i++){
                    int p1 = 0;
                    int p2 = i-1;
                    while( p1<p2){
                        if (a[p1] + a[p2] > a[i]){
                            count += p2-p1;
                            p2--;
                        }else{
                            p1++;
                        }
                    }
                }
                System.out.println(count);
            }
        }
        
    }