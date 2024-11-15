// https://codeforces.com/contest/2031/my
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner  s =new Scanner(System.in);
		int tc = s.nextInt();
		while(tc-- > 0){
		    int n = s.nextInt();
		    int[] arr1 = new int[n];
		    int[] arr2 = new int[n+1];
		    for(int i=0;i<n;i++){
		        arr1[i] = s.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        arr2[arr1[i]] = i;
		    }
		    
		    boolean success = false;
		    for(int i=1;i<n;i++){
		        if(Math.abs(arr2[i] - arr2[i+1]) != 1 ){
		            success = true;
		            break;
		        }
		    }
		    
		    if(!success){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}