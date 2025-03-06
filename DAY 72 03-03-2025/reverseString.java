
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
-------------------------------------------------------------

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            ans.append(words[i]);
            if(i != 0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}