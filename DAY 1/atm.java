// https://www.codechef.com/problems/HS08TEST

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        double y = s.nextDouble();
        if( x%5 == 0 && y >= (x+0.5)){
            double current = y - x - 0.5;
            System.out.print(current);
        }else{
            System.out.print(y);
        }
	}
}
