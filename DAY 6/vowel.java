// https://www.codechef.com/problems/VOWELTB

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ){
            System.out.println("VOWEL");
        }else{
            System.out.println("CONSONANT");
        }
	}
}
