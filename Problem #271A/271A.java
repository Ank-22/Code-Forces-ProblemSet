import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        while (y > 0) {
            y++;
            int a = y / 1000;
            int b = y / 100 % 10;
            int c = y / 10 % 10;
            int d = y % 10;
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                break;
            }
        }
        System.out.println(y);
    }
}
// Documentation
// In this question we are asked to find the year greater than the given year
// with all digits different.
// The approach for this question is like we will run a loop and keep
// incrementing and checking all its digits whether they are different from each
// other or not.
// if yes we just break the loop and print that year.