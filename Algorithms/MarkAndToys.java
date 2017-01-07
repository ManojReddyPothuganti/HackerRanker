import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] prices = new int[n];
        int sum = 0 ;
        int count = 0;
        for(int i = 0 ;i<n;i++)
            {
            prices[i] = sc.nextInt();
        }
        Arrays.sort(prices);
        for(int j=0;j<n;j++)
            {
            
            if(sum <= k)
                {
                sum = sum + prices[j];
                count = count + 1;
            }
        }
        System.out.println(count-1);
    }
}