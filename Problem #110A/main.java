import java.util.*;
public class Sol{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		long n=in.nextLong();
		int ans = 0;

		// Repeatedly taking the unit digit of n (input).
		// Comparing the unit digit (whether it is a lucky number or not). If true ans is updated by the sum of 1.
		// Updating the number n by n/10.

		while(n>0){
			if(n%10==7 || n%10==4)ans++;
			n/=10;
		}

		// If the ans itself is a lucky number we print YES, else NO.
		if(ans==4 || ans==7) System.out.println("YES");
        else System.out.println("NO");
	}
}