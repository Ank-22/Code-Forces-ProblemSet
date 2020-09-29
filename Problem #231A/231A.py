n= int(input())
count=0
for i in range (n):
    a = list(map(int,input().split()))
    cnt=0    
    for j in a:
        if(j == 1):
            cnt += 1
    if(cnt>=2):
        count +=1
print(count)