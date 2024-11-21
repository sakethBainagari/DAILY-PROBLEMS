// https://www.codechef.com/learn/course/arrays/ARRAYS02/problems/DSAAGP12?tab=statement

import java.lang.*;
import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }
            int maxSum = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                int currSum = 0;
                for(int j=i;j<n;j++){
                    currSum += a[j];
                    maxSum = Math.max(maxSum, currSum);
                }
            }
            System.out.println(maxSum);
        }
	}
}


//==================USING KADANE'S ALGO =====================

// private static int kadane(int[] nums) {
//         int currentSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int num : nums) {
//             currentSum += num;
//             if (currentSum < num) {
//                 currentSum = num;
//             }
//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }
//         }
//         return maxSum;
//     }
