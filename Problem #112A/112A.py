a= input().lower()
b=input().lower()

if(len(a)>len(b)):
    print(1)
elif(len(b)>len(a)):
    print(-1)
else:
    flag=0
    for i in range(0,len(a)):
        if(a[i]!=b[i]):
            if(ord(a[i])>ord(b[i])):
                print(1)
                flag += 1
                break
            if(ord(a[i])<ord(b[i])):
                print(-1)
                flag +=1
                break
        else:
            flag=0
if(flag == 0):
    print(0)
            