n = int(input())
sum=0
maxval= 0
for i in range(0,n):
    a,b=map(int,input().split())
    sum = sum - a + b 
    maxval=max(maxval,sum)
print(maxval)