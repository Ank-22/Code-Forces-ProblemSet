a,b=map(int,input().split())
m=a*b
if((m)%2==0):
    print(int((m)/2))
else:
    print(int((m-1)/2))