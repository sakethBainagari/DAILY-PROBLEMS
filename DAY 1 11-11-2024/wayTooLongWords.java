// https://codeforces.com/problemset/problem/71/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        for(int i=0;i<t;i++){
            String str = s.nextLine().trim();
            if(str.length() <= 10){
                System.out.println(str);
            }else{
                System.out.println("" + str.charAt(0) + (str.length()-2) + str.charAt(str.length()-1));
            }
        }
    }
}

