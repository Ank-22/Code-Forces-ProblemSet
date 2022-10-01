import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(), currcapacity=0;
        int exit, entry;

        //minimum capacity is obviously 0
        int ans=0;

        //minimum possible capacity of the tram is the maximum of all the possible capacities.

        for(int i=0; i<n; i++){
            exit = scn.nextInt();
            entry = scn.nextInt();
            currcapacity -= exit;
            currcapacity += entry;
            ans = Math.max(currcapacity, ans);
        }

        System.out.println(ans);
    }
}