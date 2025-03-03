//https://leetcode.com/problems/length-of-last-word/description/?envType=problem-list-v2&envId=string
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        ArrayList<String> ss = new ArrayList<>();
        for( String i : s.split(" ")){
            ss.add(i);
        }
        int l = ss.size();
        return (ss.get(l-1)).length();
    }
}
---------------
class Solution {
    public int lengthOfLastWord(String s) {
        // String[] arr=s.split(" ");
        // return arr[arr.length-1].length();
       s= s.trim();
        String lastWord="";
        int lastSpace=s.lastIndexOf(" ");
        if(lastSpace==-1){
            lastWord=s;
        }
        else{
            lastWord=s.substring(lastSpace+1);
        }
        return lastWord.length();

        
    }
}