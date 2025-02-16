//https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/three-parts?page=1&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
            sum += a[i];
        }
        if(sum%3 !=0 ){
            System.out.println("false");
            return;
        }

        int target = sum/3;
        int tempSum =0;
        int coutn = 0;
        for(int i=0;i<n;i++){
            tempSum += a[i];

            if(tempSum == target){
                coutn++;
                tempSum = 0;

                if(coutn == 2){
                    System.out.println("true");
                    return;
                }
            }
        }

        System.out.println("false");

    }
}