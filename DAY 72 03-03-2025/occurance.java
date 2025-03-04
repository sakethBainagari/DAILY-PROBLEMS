
//https://www.interviewbit.com/problems/occurence-of-each-number/
//funtion
public class Solution {
    public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : A){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        TreeMap<Integer,Integer> sorted = new TreeMap<>(map);
        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: sorted.entrySet()){
            res.add(entry.getValue());
        }   
        return res;
        
    }
}
