//https://leetcode.com/problems/maximum-subarray/
//https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/


//  Brute force Approach
//Brute Force  O(N^3)
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += nums[k];
                }
                max = Math.max(sum,max);
            }
        }
        return max;
    }
}

//-------------------------------------
//Better Approach  O(N*2)

//Brute Force --- >> Better Approach
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                    sum += nums[j];
                max = Math.max(sum,max);
            }
        }
        return max;
    }
}



//--------------------------------------------------
// Optimal solution using KADENE'S ALGORITHM

//Brute Force --- >> Better Approach  ----> OPTIMAL SOLUTION USING KADENE'S ALGOOO
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}
