//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/enclosing-substring?page=9&pageSize=10
import java.util.*;

public class Main {
    public  static boolean isValid(int[] countA,int[] countB){
        for(int i=0;i<26;i++){
            if(countA[i] < countB[i]) return false;
        }
        return true;
        
    }

    public static int encloseSub(int[] countA,int[] countB,String a, String b,int n,int m){
        
        for(char c : b.toCharArray()){
            countB[c-'a']++;
        }

        int ans = Integer.MAX_VALUE;
         for(int p1=0,p2=0;p2<n;p2++){
            countA[a.charAt(p2)-'a']++;
            while(isValid(countA,countB)){
                ans = Math.min(ans,p2-p1+1);
                countA[a.charAt(p1)-'a']--;
                p1++;
            }
        }
        return ans== Integer.MAX_VALUE ? -1 : ans;


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            String b = s.next();
            String a = s.next();
            int[] countA = new int[26];
            int[] countB = new int[26];

            Arrays.fill(countA,0);
            Arrays.fill(countB,0);
            int n=a.length();
            int m=b.length();

           System.out.println(encloseSub(countA,countB,a,b,n,m));
        }
    }
}