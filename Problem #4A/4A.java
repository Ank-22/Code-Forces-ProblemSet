import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if (w % 2 == 0 && w > 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
// Documentation
// It have been asked that whether we can divide the watermelon into two parts
// with even weights
// If yes print YES else print NO
// So basically applying brute force approach we will apply the condition that
// the weight of watermelon must be even and also it should not be less than 2
// if it will be less than 2 then we will not be able to divide it into two even
// kilos weight.
// the user input is taken through scanner class.