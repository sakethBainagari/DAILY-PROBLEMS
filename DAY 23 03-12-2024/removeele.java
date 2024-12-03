
//https://leetcode.com/problems/remove-element/?envType=problem-list-v2&envId=array&difficulty=EASY
//brute force
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                count++;
            }
        }
        return count;
    }
}


//OPTIMAL SOLUTION
// two pointer for optimal solution
class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0; 
        int right = nums.length - 1; 

        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}