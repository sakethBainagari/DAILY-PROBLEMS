 # https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/finding-the-floor


import bisect

INT_MIN = -2147483648

def find_floor(arr,x):
    pos = bisect.bisect_right(arr,x)
    if pos == 0:
        return INT_MIN
    else:
        return arr[pos-1]

def solve():
    n = int(input())
    arr = list(map(int,input().split()))
    arr.sort()

    q=int(input())
    for i in range(q):
        x = int(input())
        print(find_floor(arr,x))

solve()