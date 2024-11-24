
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = -1;
        int n = nums.size();
        for (int i = 0; i <= n - l; i++) {
            int sum = 0;
            for (int j = i; j < i + l; j++) {
                sum += nums.get(j);
            }
            if (sum > 0) {
                if (min == -1) min = sum;
                else min = Math.min(sum, min);
            }
            for (int j = i + l; j < i + r && j <n; j++) {
                sum += nums.get(j);

                if (sum > 0) {
                    if (min == -1) min = sum;
                    else min = Math.min(sum, min);
                }
            }
        }

        return min;

        
        
    }
}