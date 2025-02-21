//strings

//https://www.codechef.com/problems/HAPPYSTR?tab=statement

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            int count = 0;
            boolean isHapp = false;
            for(char c: s.toCharArray()){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    count++;
                    if(count > 2){
                        isHapp = true;
                        break;
                    }
                }else{
                    count = 0;
                }
            }
            
            if(isHapp){
                System.out.println("Happy");
            }else{
                System.out.println("Sad");
            }
        }
    }
}
