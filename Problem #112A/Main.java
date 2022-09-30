import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        int n = s1.length();
        char c1, c2;
        for(int i=0; i<n; i++){
            //Convert the both characters to a common case say lowercase so that the comparison becomes case insensitive
            c1 = Character.toLowerCase(s1.charAt(i));
            c2 = Character.toLowerCase(s2.charAt(i));
            if(c1<c2){
                //1st string is smaller than 2nd string
                System.out.println("-1");
                return;
            }else if(c1>c2){
                //2nd string is smaller than 1st string
                System.out.println("1");
                return;
            }
        }
        System.out.println("0");
    }
}