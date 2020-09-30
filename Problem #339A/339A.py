n = list(input().split('+'))
n.sort()
for i in range (0,len(n)):
    if(i+1 == len(n)):
        print(str(n[i]))
    else:
        print(str(n[i]),end='+')