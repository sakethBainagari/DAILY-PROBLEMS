//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
//BRUTE FORCE
class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < min)  min = nums[i];
        }

        return min;
    }
}


//OPTIMAL SOLUTION 
// BINARY SEARCH
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        if (nums[left] <= nums[right]) {
            return nums[left];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left];
    }
}
