
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/first-repeating-character-2?page=0&pageSize=10&search=first
import java.io.*;
import java.util.*;

public class Main {

    public static char frc2(String str, int n){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(str.charAt(i))){
                return str.charAt(i);
            }else{
                set.add(str.charAt(i));
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

            System.out.println(frc2(str,n));
        }
    }
}