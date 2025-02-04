
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/smaller-elements?page=0&pageSize=10&search=small
import java.util.*;

public class Main {
    static long count = 0;
    public static void ms(int[] arr, int n , int low,int high){
        if(low >= high) return;
        int mid  = (low+high)/2;
        ms(arr,n,low,mid);
        ms(arr,n,mid+1,high);
        merge(arr,n,low,mid,high);
    }

    public static void merge(int[] arr, int n, int low, int mid,int high){
        int temp[] = new int[high-low+1];
        int p1=low, p2=mid+1,k=0;
        while(p1<=mid && p2 <=high){
            if(arr[p1] <= arr[p2]){
                temp[k++] = arr[p1++];
            }else{
                temp[k++] = arr[p2++];
                count += (mid-p1+1);
            }
        }
        while(p1<=mid){
            temp[k++] = arr[p1++];
        }
        while(p2<=high){
            temp[k++] = arr[p2++];
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp[i-low];
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
            count = 0;
            ms(arr, n , 0 , n-1);
            System.out.println(count);
        }    
    }
    
    
}