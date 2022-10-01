# Problem #116A

[Link to the Problem](https://codeforces.com/problemset/problem/116/A)

The problem is to find minimum possible capacity of the tram.<br>
The minimum capacity required is the maximum of all possible capacities at different instances of time.<br>
Note that the capacity of the tram changes only at stops.<br>
We keep a variable currcapacity to denote the current capacity of the tram.<br>
At a particular stop some people enter and some exit. We make these changes to the variable currcapacity.<br>
```
exit = scn.nextInt();
entry = scn.nextInt();
currcapacity -= exit;
currcapacity += entry;
```
Now we update the ans by taking the max of ans and currcapacity.<br>
```
ans = Math.max(currcapacity, ans);
```
