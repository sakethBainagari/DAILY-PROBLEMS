

class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length() >2){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int newD= (s.charAt(i)-'0' +s.charAt(i+1)-'0')%10;
                sb.append(newD);          
            }
             s= sb.toString(); 
        }
        return s.charAt(0) == s.charAt(1);
    }
}©leetcode