n = int(input())
s =input()

ca=0
cd=0
for i in s:
    if(i == 'A'):
        ca +=1
    elif(i=='D'):
        cd +=1
if(ca > cd):
    print("Anton")
elif(ca<cd):
    print("Danik")
else:
    print("Friendship")