//https://www.codechef.com/problems/TSORT?tab=statement
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		int[] arr = new int[tc];
		ArrayList<Integer> list  = new ArrayList<>();
		while(tc-->0){
		    int n = s.nextInt();
		    list.add(n);
		}
		Collections.sort(list);
		for(int i:list){
		    System.out.println(i);
		}
        
	}
}
