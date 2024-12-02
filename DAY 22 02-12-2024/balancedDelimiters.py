#https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/balanced-parentheses?page=0&pageSize=10&search=ba
# Enter your code here. Read input from STDIN. Print output to STDOUT
def genereateAllposiiPar(n,idx,oc, cc, ch):

    if idx == n:
        print("".join(ch))
        return
    if oc < n/2:
        ch.append('{')
        genereateAllposiiPar(n,idx+1,oc+1,cc,ch)
        ch.pop()

    if(cc < oc):
        ch.append('}')
        genereateAllposiiPar(n,idx+1,oc,cc+1,ch)
        ch.pop()

tc = int(input())
for t in range(1,tc+1):
    print(f"Test Case #{t}:")
    n = 2*(int(input()))
    idx = 0
    oc = 0
    cc = 0
    ch = []
    genereateAllposiiPar(n,idx,oc,cc,ch) # we direct pass 0's here  (n,0,0,0,ch)