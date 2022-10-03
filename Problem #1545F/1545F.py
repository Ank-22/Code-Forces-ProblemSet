for _ in range(int(input())):
    n,k=map(int,input().split())
    
    
    arr=list(map(int,input().split()))
    
    if k==1:
        print("YES")
    else:
          
        a=[(q-p) for p,q in zip(arr,arr[1:])]
        if a!=sorted(a):
            print("NO")
        else :
            if a[0]*(n-k+1)>=arr[0]:
                print("YES")
            else:
                print("NO")