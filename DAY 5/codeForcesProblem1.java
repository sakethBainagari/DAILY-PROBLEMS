// https://codeforces.com/contest/2031/problem/A

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		while(tc-- > 0){
		    int n = s.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = s.nextInt();
		    }
		    int maxH = 0;
		    for(int i=0;i<n;i++){
		        int count =1;
		        int currH = arr[i];
		        for(int j=i+1;j<n;j++){
		            if(arr[j] >= currH){
		                count++;
		                currH = arr[j];
		            }
		        }
		        maxH = Math.max(maxH,count);
		    }
		    System.out.println(n-maxH);
		    
		}
	}
}