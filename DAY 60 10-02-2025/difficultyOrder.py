# https://www.codechef.com/problems/RATINGINPRAC?tab=statement

t = int(input())
    
def Difficulty_rating(d):
    for i in range(1,len(d)):
        if d[i] < d[i-1]:
            return "No"
    return "Yes"
for _ in range(t):
    n = int(input())
    d = list(map(int, input().split()))
    
    print(Difficulty_rating(d))
