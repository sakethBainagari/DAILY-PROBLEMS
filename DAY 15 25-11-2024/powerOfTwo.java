
//https://leetcode.com/problems/power-of-two/?envType=problem-list-v2&envId=recursion&difficulty=EASY

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <=0) return false;
        else if(n<=2) return true;
        long pow = 1;
        while(pow<=n){
            pow *=2;
            if(pow == n){
                return true;
            }
        }
        return false;
    }
}