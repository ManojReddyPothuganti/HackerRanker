import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int count =0;
        for(int i=0;i<n;i++)
            {
            a[i] = in.nextInt();
        }
        for(int i=1;i<n;i++)
            {
            if(a[i] != a[i-1] + 1 )
                {
                count ++ ;
            }
        }
        if(a[0]!= 1)
            {
            count = count + 1 ;
        }
        System.out.println(count);
    }
}
