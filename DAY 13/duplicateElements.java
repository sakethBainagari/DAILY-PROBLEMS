//https://leetcode.com/problems/contains-duplicate/

// Brute Force
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            } 
        }
        return false;

    }
}


//---------------------------------------------------
// Better Approach(NlogN)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);   // O(NlogN)
        for(int i=0;i<nums.length-1;i++){  //O(N)
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

/--------------------------------

// Optimal Solution using HASHSET O(N)
class Solution {
    public boolean containsDuplicate(int[] nums) {
            Set<Integer> Arrset = new HashSet<>();
            for(int i:nums){
                if(Arrset.contains(i)){
                    return true;
                }
                Arrset.add(i);
            }
            return false;
    }
}