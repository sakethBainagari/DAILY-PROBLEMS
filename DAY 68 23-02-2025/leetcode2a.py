class Solution:
    def maxSum(self, grid: List[List[int]], limits: List[int], k: int) -> int:
        leng = len(grid)
        rowLen = len(grid[0])

        ele = [] 
        for i in range(leng):
            grid[i].sort()
            limi = limits[i]


            for j in range(rowLen-1,-1,-1):
                if limi >0:
                    ele.append(grid[i][j])
                    limi -=1
        ele.sort(reverse =True)

        return sum(ele[:k])©leetcode