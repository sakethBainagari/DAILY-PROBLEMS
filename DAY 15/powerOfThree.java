//https://leetcode.com/problems/power-of-three/?envType=problem-list-v2&envId=recursion&difficulty=EASY

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <=0) return false;
        else if(n==3 || n==1) return true;
        long pow = 1;
        while(pow<=n){
            pow *=3;
            if(pow == n){
                return true;
            }
        }
        return false;
    }
}