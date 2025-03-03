
//https://leetcode.com/problems/find-the-highest-altitude/?envType=problem-list-v2&envId=array
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = 0;
        int curr = 0;
        for(int i=0;i<n;i++){
            curr = curr + gain[i];
            max = Math.max(max,curr); 
        }
        return max;
    }
}