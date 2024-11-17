import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int tc = s.nextInt();
        int[] resArr = new int[tc];
        
        for (int t = 0; t < tc; t++) {
            int n = s.nextInt(); 
            int[] arr = new int[n];
            int[] freq = new int[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                freq[arr[i]]++;
            }
            
            int score = 0;
            for (int i = 1; i <= n; i++) {
                score += freq[i] / 2;
            }
            
            resArr[t] = score;
        }
        
        for (int j : resArr) {
            System.out.println(j);
        }
    }
}