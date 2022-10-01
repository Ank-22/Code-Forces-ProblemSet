# Problem #116A

[Link to the Problem](https://codeforces.com/problemset/problem/116/A)

## LOGIC:

The problem is to find minimum possible capacity of the tram.<br>
The minimum capacity required is the maximum of all possible capacities at different instances of time.<br>
Note that the capacity of the tram changes only at stops.<br>
We keep a variable currcapacity to denote the current capacity of the tram.<br>
At a particular stop some people enter and some exit. We make these changes to the variable currcapacity.<br>
```
exit = scn.nextInt();
entry = scn.nextInt();
currcapacity = currcapacity-exit+entry;
```
Now we update the ans by taking the max of ans and currcapacity.<br>
```
ans = Math.max(currcapacity, ans);
```

***Time Complexity of Code: *** O(n)<br>
***Space Complexity of Code: ***O(1)<br>

## DRY RUN:

**INPUT:** <br>
4<br>
0 3<br>
2 5<br>
4 2<br>
4 0<br>

ans = 0

| Position | exit | entry | currcapacity |      ans      |
|:--------:|:----:|:-----:|:------------:|:-------------:|
| 0        | 0    | 3     | 0-0+3 = 3    | max(3, 0) = 3 |
| 1        | 2    | 5     | 3-2+5 = 6    | max(6, 3) = 6 |
| 2        | 4    | 2     | 6-4+2 = 4    | max(4, 6) = 6 |
| 3        | 4    | 0     | 4-4+0 = 0    | max(0, 6) = 6 |

**OUTPUT:** <br>
6
