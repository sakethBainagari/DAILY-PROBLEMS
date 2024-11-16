// https://codeforces.com/contest/2031/my
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while (tc-- > 0) {
            int n = s.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = s.nextInt();
            }
            boolean success = true;
            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(arr1[i] - arr1[i + 1]) != 1 && arr1[i] > arr1[i + 1]) {
                    success = false;
                    break;
                }
            }

            if (success) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
