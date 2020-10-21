a = input()
b = input()
c= b[::-1]
la = len(a)
lb = len(b)
if (la>lb or la<lb):
    print("NO")
else:
    if(a == c):
        print("YES")
    else:
        print("NO")