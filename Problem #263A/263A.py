for i in range(0, 5):
    s = list(map(int, input().split()))
    for k in range(0, 5):
        if s[k] == 1:
            print (abs(i - 3+1) + abs(k - 3+1))
            break