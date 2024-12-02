
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/interleavings?page=0&pageSize=10&search=inter
import java.io.*;
import java.util.*;

public class Main {
    public static void genInterliv(String a, String b, int i,int j,String curr, List<String> res ){
        if(i == a.length() && j == b.length()){
            res.add(curr);
        } 


        if(i < a.length()) genInterliv(a,b,i+1,j,curr + a.charAt(i),res);

        if(j < b.length()) genInterliv(a,b,i,j+1,curr + b.charAt(j),res);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        for(int t=1;t<=tc;t++){
            String a = s.next();
            String b = s.next();
            List<String> res = new ArrayList<>();
            genInterliv(a,b,0,0,"",res);
            Collections.sort(res); // for printing in lexicological order we have to sort
            System.out.println("Case #"+t+":");
            for(String i : res){
                System.out.println(i);
            }
        }
        
    }
}