// https://www.hackerrank.com/challenges/compare-the-triplets/problem



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s  =new Scanner(System.in);
		int n = 3;
		int[] a = new int[n];
		int[] b =new int[n];
		
		for(int i=0;i<n;i++){
		    a[i] = s.nextInt();
		}
		
		for(int i=0;i<n;i++){
		    b[i] = s.nextInt();
		}
		
		int alice = 0;
		int bob = 0;
		for(int i=0;i<n;i++){
		    if(a[i] > b[i]){
		        alice += 1;
		    }else if(a[i] < b[i]){
		        bob += 1;
		    }
		    
		}
		System.out.print(alice + " " + bob);
	}
}
