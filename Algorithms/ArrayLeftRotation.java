import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int newPos = 0;
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int newArray[] = new int[n];
        for(int i=0;i<n;i++)
            {
            newPos = (i+k)%n;
            newArray[i] = a[newPos]; 
            System.out.print(newArray[i] + " ");
        }
        
    }
}
