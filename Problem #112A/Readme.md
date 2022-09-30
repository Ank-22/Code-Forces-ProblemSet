# Problem #112A

[Link to the Problem](https://codeforces.com/problemset/problem/112/A)

## LOGIC:

In this question we have to compare two strings of same length lexicographically.
The case of the letters doesn't matter here.
Therefore the approach is to compare character by character starting from the left side of both the strings
and since the comparison is case insensitive we have to convert both the characters to a common case either lower case or upper case.
We convert both the characters to lower case and then compare.

If c1(character in string 1) < c2(character in string 2) then string 1 is lexicographically smaller than string 2.
We output -1 and return since we are now done comparing

If c1(character in string 1) > c2(character in string 2) then string 2 is lexicographically smaller than string 1.
We output 1 and return since we are now done comparing

Otherwise we continue our comparison.

## DRY RUN:

**INPUT:** <br>
abcdefg
AbCdEfF

| Position | c1 | c2 | Result                                                                                   |
|----------|----|----|------------------------------------------------------------------------------------------|
| 0        | a  | a  | c1==c2  Therefore, comparison continues.                                                 |
| 1        | b  | b  | c1==c2  Therefore, comparison continues.                                                 |
| 2        | c  | c  | c1==c2  Therefore, comparison continues.                                                 |
| 3        | d  | d  | c1==c2  Therefore, comparison continues.                                                 |
| 4        | e  | e  | c1==c2  Therefore, comparison continues.                                                 |
| 5        | f  | f  | c1==c2  Therefore, comparison continues.                                                 |
| 6        | g  | f  | c1>c2 Therefore the following piece of code executes {System.out.println("1"); return; } |

**OUTPUT:** <br>
1

------------------------------------------------------------------------------------------------------------------------------

**INPUT:** <br>
dEmoTESt
DeMoTeST

| Position | c1 | c2 | Result                                   |
|----------|----|----|------------------------------------------|
| 0        | d  | d  | c1==c2  Therefore, comparison continues. |
| 1        | e  | e  | c1==c2  Therefore, comparison continues. |
| 2        | m  | m  | c1==c2  Therefore, comparison continues. |
| 3        | o  | o  | c1==c2  Therefore, comparison continues. |
| 4        | t  | t  | c1==c2  Therefore, comparison continues. |
| 5        | e  | e  | c1==c2  Therefore, comparison continues. |
| 6        | s  | s  | c1==c2  Therefore, comparison continues. |
| 7        | t  | t  | c1==c2  Therefore, comparison continues. |

the control comes out of the loop therefore line 24 of code(System.out.println("0");) executes. 

**OUTPUT:** <br>
0

