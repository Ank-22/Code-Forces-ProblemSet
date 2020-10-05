n,t = map(int,input().split())

for i in range(t):
    if(n%10 ==0):
        n=n/10
    else:
        n -= 1
print(int(n))