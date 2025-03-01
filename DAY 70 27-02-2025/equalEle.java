//https://www.codechef.com/problems/EQUALELE?tab=statement
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
                map.put(a[i],map.getOrDefault(a[i],0)+1);
            }
            int max = 0;
            for(int freq:map.values()){
                if(freq> max){
                    max = freq;
                }
            }
            System.out.println(n-max);
        }
	}
}