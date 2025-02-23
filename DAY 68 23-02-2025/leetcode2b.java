class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {

        int r = grid.length;
        int c = grid[0].length;

        StringBuffer sb = new StringBuffer();
        ArrayList<Integer> list = new ArrayList<>();
   

        for(int i=0; i<r; i++){
            Arrays.sort(grid[i]);
            int l = limits[i];
            
            for(int j=c-1; j>=0; j--){
                if(l>0){
                    list.add(grid[i][j]);
                    
                    l--;
                }
            }
        }

        Collections.sort(list,Collections.reverseOrder());
        Long sum = 0L;
        for(int i=0; i<k; i++){
            sum+=list.get(i);
        }

        return sum;
    }
}©leetcode