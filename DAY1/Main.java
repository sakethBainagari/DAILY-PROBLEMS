https://codeforces.com/problemset/problem/282/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = 0;
        s.nextLine();
        for (int i = 0; i < n; i++) {
            String str = s.nextLine();
            if (str.contains("++")) {
                x += 1;
            } else if (str.contains("--")) {
                x -= 1;
            }
        }

        System.out.println(x);

    }
}
