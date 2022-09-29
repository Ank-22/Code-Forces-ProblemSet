import java.util.*;
import java.lang.*;
import java.io.*;
public class 158A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int a = arr[k-1];
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
//Documentation for this solution
// In this question we basically need to find out how many participants have scored more than the participant at kth position and the condition is also that the participants must have earned positive score
// Applying brute force approach
// We will just run a loop and iterate the array and increment the count variable whenever the score of the participant is greater than that of participant at kth postition and its score must be greater than zero.
//Since indexing starts from zero , the score of the particpant at kth position will be arr[k-1] , we just need to compare all participants score with arr[k-1] with condition that the score should be greater than zero.
//At the last just print the count variable and that will be our answer.