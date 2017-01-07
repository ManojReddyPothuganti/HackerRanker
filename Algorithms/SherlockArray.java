import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0)
            {
            boolean flag = false;
            int sum = 0;
            int left = 0;
            int n = in.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                {
                a[i] = in.nextInt();
                sum = sum + a[i];
            }
            
            for(int i=0;i<n;i++)
                {
                sum = sum - a[i];
                if(left==sum)
                    {
                    flag = true;
                    break;
                }
                left = left + a[i];
            }
            
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
        
    }
}