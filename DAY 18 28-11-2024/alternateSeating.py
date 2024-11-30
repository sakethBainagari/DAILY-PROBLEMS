#https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/alternate-seating?page=1&pageSize=10

# Enter your code here. Read input from STDIN. Print output to STDOUT
def seating(n, m, seats):
    seated = 0
    for i in range(m):
        if seats[i] == 0:
            if (i==0 or seats[i-1]) and (i== m-1 or seats[i+1]==0):
                seated +=1
                seats[i] = 1
        if seated == n:
            return "YES"
    return "NO"
n = int(input())
m = int(input())

seats = list(map(int,input().split()))
print(seating(n,m,seats))