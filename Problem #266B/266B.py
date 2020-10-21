a,b = map(int,input().split())
c= input()
list1=list(c)
for i in range (b):
    for j in range (a):
        if (list1[j]=="B" and j<a-1):
            tmp= list1[j]
            list1[j]=list1[j+1]
            list1[j+1]= tmp
str1 = ''.join(list1)
print(str1)