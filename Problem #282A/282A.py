n = int(input())
count=0
for i in range(n):
    c=input()
    if(c=='++X'):
        count +=1
    elif(c=='--X'):
        count -= 1
    elif(c=='X++'):
        count +=1
    elif(c=='X--'):
        count -=1
print(count)