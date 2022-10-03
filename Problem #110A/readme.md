# Problem #110A

[Link to the Problem](https://codeforces.com/problemset/problem/110/A)
The problem is to find the total lucky numbers in the input number.
Lucky numbers: 4 or 7.

We run a loop for repeatedly taking the unit digit of the number.
Compare the unit digit whether it is a lucky number or not.
If TRUE updating the ans(total number of lucky numbers so far) variable.
Now, we update the number by number/10.
And the loop continues until the number becomes 0.

