k,n,w=map(int,input().split())
sum = 0
for i in range (0,w):
    sum =sum +((i+1)*k)
if(sum>n):
    print(sum-n)
else:
    print(0)
