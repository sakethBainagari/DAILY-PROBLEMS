//https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
//Brute Force  (NlogN)

class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        Arrays.sort(arr);
        long min = arr[0];
        long max = arr[arr.length - 1];
        return new Pair<>(min, max);
    }
}

// Better solution O(N)
class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        long min = arr[0];  // we can use Long.MAX_VALUE
        long max = arr[0];  // we can use Long.MIN_VALUE
        for(int i : arr){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        return new Pair<>(min,max);
    }
}


// optimal solution O(N)  divide and conquer rule


