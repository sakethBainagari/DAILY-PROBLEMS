
//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=problem-list-v2&envId=string

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        ArrayList<String> list= new ArrayList<>();
        for(String i : s.split("\\s+")){
            list.add(i);
        }
        Collections.reverse(list);
        
        return String.join(" ", list);
    }
}
