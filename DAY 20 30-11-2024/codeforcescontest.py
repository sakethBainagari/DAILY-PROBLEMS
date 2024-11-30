
#https://codeforces.com/contest/2034/problem/A
import math
 
def lcm(a, b):
    return a * b // math.gcd(a, b)
 
def main():
    t = int(input()) 
    for _ in range(t):
        a, b = map(int, input().split()) 
        print(lcm(a, b)) 
 
if __name__ == "__main__":
    main()
