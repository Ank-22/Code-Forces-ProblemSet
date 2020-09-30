a,b = map(int,input().split())

c= list(map(int,input().split()))
count=0
for i  in c:
    if(i>=c[b-1] and i>0):
        count += 1
print(count)