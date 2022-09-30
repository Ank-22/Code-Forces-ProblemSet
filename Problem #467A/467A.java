import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while (n-- > 0) {
            int[] arr = new int[2];
            for (int i = 0; i < 2; i++) {
                arr[i] = sc.nextInt();
            }
            if ((arr[1] - arr[0]) >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }

}
// Documentation
// In this the dormitory has n rooms with each room has p pi people with maximum
// accomodation of qi
// We just have to find how many rooms are there in which george and his friend
// can accomodate
// Applying brute force
// Initialise a count variable and run the loop n times and each time new array
// is created with size 2 then we will put the condition if the difference
// between the elements greater than equal to 2.
// and increment the variable count
// Finally print the count.
