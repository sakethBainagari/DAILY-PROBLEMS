//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/finding-the-floor?page=0&pageSize=10&search=floor
import java.io.*;
import java.util.*;

public class Main {
    public static int findfloor(int[] a ,int p,int low, int high){
        int floor = Integer.MIN_VALUE;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(p == a[mid]){
                return a[mid];
            }else if( p < a[mid]){
                high = mid-1;
            }else{
                floor = a[mid];
                low = mid+1;
            }
        }
        return floor;
    }
    public static void main(String[] args) {
        
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }
            Arrays.sort(a);
            int q = s.nextInt();
            while(q-->0){
                int p = s.nextInt();
                System.out.println(findfloor(a,p,0,n-1));
            }
        
        
    }
}