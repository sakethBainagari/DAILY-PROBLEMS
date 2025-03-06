//https://leetcode.com/problems/number-of-different-integers-in-a-string/description/
//use set

class Solution {
    public int numDifferentIntegers(String word) {
        String[] words = word.replaceAll("[^0-9]"," ").split("\\s+");
        Set<String> set = new HashSet<>();
        for(String i : words){
            if(!i.isEmpty()){
               // set.add(String.valueOf(Integer.parseInt(i)));
               // for large number use bellow one
               set.add(String.valueOf(new java.math.BigInteger(i)));
            }
        }
        return set.size();
    }
}