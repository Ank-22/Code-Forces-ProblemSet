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