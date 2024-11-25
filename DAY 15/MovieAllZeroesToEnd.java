//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751
//https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/

// Brute force

import java.util.ArrayList;
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n  = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();
        // copy non zero elements to temp array
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        // copy elements from temp array to original array
        int tempN = temp.size();
        for(int i=0;i<tempN;i++){
            arr[i] = temp.get(i);
        }
        
        for(int i=tempN;i<n;i++){
            arr[i] = 0;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// optimal solution
// two pointers
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int j = -1;
        // seearching for zero value to start j pointer
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j==-1){
            return;
        }
       
        // now itereating form j+1 position
        for(int i=j+1;i<n;i++){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            
        }
        
    }
}