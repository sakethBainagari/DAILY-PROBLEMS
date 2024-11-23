//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

//Brute force
class Solution {
    public int[] reverseArrayBruteForce(int[] arr) {
        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }
        return revArr;
    }
}

//-------------------------------------------------------------------------
// Brute force ----> Better
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        Stack<Integer> stack = new Stack<>();
        for(int i:arr){
            stack.push(i);
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = stack.pop();
        }
    }
}


//---------------------------------------------------------------------------
// Brute force ------->Better ------> Optimal using 2 pointers

// Brute force ----> optimal using 2 pointers
class Solution {
    public void reverseArray(int arr[]) {
        // code here
       int low = 0, high = arr.length - 1;
       while(low < high){
           int temp = arr[low];
           arr[low] = arr[high];
           arr[high] = temp;
           
           low++;
           high--;
       }
    }
}
