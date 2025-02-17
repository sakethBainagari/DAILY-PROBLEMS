
#https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/maximum-contiguous-subsequence?page=6&pageSize=10
def maxConSeq(a,n):
    num_set = set(a)  # it removes duplicates
    maxlen = 0
    #best_sequence =[]
    for num in num_set:
        if num-1 not in num_set:
            curr = num
            cur_len = 1
            #sequence.append(curr)
            while curr+1 in num_set:
                curr += 1
                cur_len += 1
            maxlen = max(cur_len,maxlen)
            #remove above line 
            #if cur_len > maxlen:
            #    maxlen =cur_len
            #    best_sequence = sequence

    #return maxlen, best_sequence
    return maxlen

t = int(input())

for i in range(t):
    n = int(input())
    a = list(map(int,input().split()))
    print(maxConSeq(a,n))