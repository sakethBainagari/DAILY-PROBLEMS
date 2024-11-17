//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/checkerboard-pattern
//HIVE CHECKER BOARD
import java.util.*;

public class checkerBoardHIVE {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        for(int t=0;t<tc;t++){
            int n = s.nextInt();
            System.out.println("Case #" + (t+1) + ":");
            int a = 0;
            int flag = 1;
            for(int i=1;i<=n*2;i++){
                if(a==0){
                    flag =2;
                }else if(a==1){
                    flag = 1;
                }

                for(int j=1;j<=n;j++){
                    if(flag==2){
                        System.out.print("**");
                        flag =1;
                    }else if(flag == 1){
                        System.out.print("--");
                        flag = 2;
                    }
                }
                System.out.println();
                if(i%2 == 0){
                    if(a==0){
                        a=1;
                    }else{
                        a=0;
                    }
                }
            }
        }
    }
}