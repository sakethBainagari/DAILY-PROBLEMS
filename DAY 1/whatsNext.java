// https://www.spoj.com/problems/ACPC10A/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
	        int a1 = s.nextInt();
	        int a2 = s.nextInt();
	        int a3 = s.nextInt();
	        if(a2-a1 ==a3-a2){
	            System.out.println("AP " + (a3+(a3-a2)));
	              
	        }else if( a2/a1 == a3/a2){
	            System.out.println("GP " + (a3*(a3/a2)));
	        }
	     }
    }
}
