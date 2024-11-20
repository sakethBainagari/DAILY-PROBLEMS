https://www.spoj.com/problems/ADDREV/

import java.util.*;

public class Main {
    
    public static int reverse(int n){
        int rev = 0;
        while(n!=0){
            int rem = n %10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return rev;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int reva = reverse(a);
            int revb = reverse(b);
            int c = reva + revb;
            int rev = reverse(c);
            System.out.println(rev);
        }
    }
}
