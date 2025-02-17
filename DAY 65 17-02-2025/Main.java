//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/distinct-elements-in-window?page=0&pageSize=10&search=distin\


import java.io.*;
import java.util.*;

public class Main {


    public static void distinctWin(int[] a, int k,int n){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<k;i++){
            map.put(a[i], map.getOrDefault(a[i],0) + 1);
        }
        System.out.print(map.size());

        for(int i=k;i<n;i++){
            if(map.get(a[i-k]) == 1){
                map.remove(a[i-k]);
            }else{
                map.put(a[i-k],map.get(a[i-k]) - 1);
            }

            map.put(a[i], map.getOrDefault(a[i],0) +1);
            System.out.print(" " + map.size());
        }
        System.out.println();


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int k = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }
            distinctWin(a,k,n);
        }
    }
}