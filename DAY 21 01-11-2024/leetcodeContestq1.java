//https://leetcode.com/contest/weekly-contest-426/problems/smallest-number-with-all-set-bits/

class Solution {
    public int smallestNumber(int n) {
        // String s = Integer.toBinaryString(n);
        // char[] c = s.toCharArray();
        // for(int i=0;i<c.length;i++){
        //     if(c[i] == '0'){
        //         c[i] = '1';
        //     }   
        // }
        // String bS = new String(c);
        // return Integer.parseInt(bS,2); 
        int temp = 1;
        
        while (temp <= n) {
            temp = (temp << 1);    
        }
        System.out.println(temp-1);
        return temp-1;

    }
}