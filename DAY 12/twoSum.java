    //https://leetcode.com/problems/two-sum/
    //https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/
    //Brute force approach
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] arr = new int[2];
            for(int  i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]  == target){
                        arr[0] = i;
                        arr[1] = j;
                        return arr;
                    }
                }
            }
            return arr;
        }
    } 
    //-------------------------------------------------------------------------


    //optimal solution using HASHMAP

    //Brute force approach --->> Better approach Solution USING HASHMAP
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] arr = new int[2];
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int num = nums[i];
                int required = target - num;
                if(hm.containsKey(required)){
                    arr[0] = hm.get(required);
                    arr[1] = i;
                    return arr;
                }
                hm.put(nums[i],i);
            }
            return arr;
        }
    } 


    //-----------------------------------------------------------------------------

    // OPTIMAL SOLUTION USING 2 POINTERS

    import java.util.*;

    public class Main {
        public static String twoSum(int n, int []arr, int target) {
            Arrays.sort(arr);
            int left = 0, right = n - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    return "YES";
                } else if (sum < target) left++;
                else right--;
            }
            return "NO";
        }

        public static void main(String args[]) {
            int n = 5;
            int[] arr = {2, 6, 5, 8, 11};
            int target = 14;
            String ans = twoSum(n, arr, target);
            System.out.println("This is the answer for variant 1: " + ans);

        }

    } 