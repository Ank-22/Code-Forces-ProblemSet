import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            int t = s.length();
            if (s.length() <= 10) {
                System.out.println(s);
            } else {
                System.out.print(s.charAt(0));
                System.out.print((t - 2));
                System.out.println(s.charAt(t - 1));
            }
        }
    }
}
// Documentation
// Applying brute force approach
// In this problem we just need to print that string if the length of string is
// less than equal to 10
// or if the length is greater than 10 just print the starting character then no
// of characters in between and finally the last character
// charAt function is used to get the character from the string
// user input is taken through Scanner class.
