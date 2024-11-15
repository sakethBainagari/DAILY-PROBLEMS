// https://www.codechef.com/problems/CS2023_STK

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
        
            // Your code goes here
            int maxOm = 0;
            int CurrOm = 0;
            for(int i=0;i<n;i++){
                if(a[i] > 0){
                    CurrOm++;
                    maxOm = Math.max(maxOm, CurrOm);
                }else{
                    CurrOm = 0;
                }
            }
            
            int maxAddy = 0;
            int CurrAddy = 0;
            for(int i=0;i<n;i++){
                if(b[i] > 0){
                    CurrAddy++;
                    maxAddy = Math.max(maxAddy, CurrAddy);
                }else{
                    CurrAddy =0;
                }
            }
            
            
            if(maxAddy > maxOm){
                System.out.println("Addy");
            }else if(maxOm > maxAddy){
                System.out.println("Om");
            }else{
                System.out.println("Draw");
            }
        }
    }
}
