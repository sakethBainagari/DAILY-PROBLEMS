import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            String str  = s.next();
            int count = 0;
            boolean found = false;
            for(int i=0;i<n;i++){
                if (!isVowel(str.charAt(i))) {
                    count++;
                    if (count >= 4) {
                        found = true;
                        break;
                    }
                } else {
                    count = 0; 
                }
            }
            
            if(found){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
	}
}
