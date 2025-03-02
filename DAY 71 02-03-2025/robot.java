
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
        while(tc-->0){
            int n = s.nextInt();
            int k = s.nextInt();
            String ss =  s.next();
            Set<Integer> set = new HashSet<>();
            set.add(k);
            for(char ch:ss.toCharArray()){
                if(ch == 'L'){
                    k--;
                    set.add(k); // or here we can use --k directly
                }else if(ch=='R'){
                    k++;
                    set.add(k);
                }else{
                    k--;
                    set.add(k);
                }
            }
            System.out.println(set.size());
        }
	}
}
