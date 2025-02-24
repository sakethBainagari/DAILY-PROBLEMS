//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/number-of-anagramic-groups?page=8&pageSize=10

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int m = s.nextInt();


            Map<String,Integer> anagram = new HashMap<>();
            for(int i=0;i<n;i++){
                String str = s.next();
                char[] cA= str.toCharArray();
                Arrays.sort(cA);
                String SortedStrr = new String(cA);
                anagram.put(SortedStrr,anagram.getOrDefault(SortedStrr,0)+1);

            }

            System.out.println(anagram.size());
            
            


        }
    }
}