
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/first-repeating-character-1?page=0&pageSize=10&search=first
import java.io.*;
import java.util.*;

public class Main {
    public static char firRepChar(String str, int n){
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(str.charAt(i)== str.charAt(j)) {
                        return str.charAt(i);
                    }
                }
            }
            return '.';

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            String str = s.next();
            int n = str.length();
            System.out.println(firRepChar(str,n));

        }
    }
}