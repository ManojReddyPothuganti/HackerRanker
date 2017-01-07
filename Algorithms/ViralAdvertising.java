import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum =2;
        int i = 2;
        int temp = 0;
       while(n>1)
           {
           temp = (i*3)/2;
           sum = sum +temp;
           i = temp;n--;
       }
        System.out.println(sum);
        
    }
}