
//https://leetcode.com/problems/power-of-four/?envType=problem-list-v2&envId=recursion&difficulty=EASY
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        else if(n<4) return false;
        long pow = 1;
        while(pow <=n){
            pow *= 4;
            if(pow == n){
                return true;
            }
        }
        return false;
    }
}