import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int minE = 0;
        for(int i =0 ;i <N;i++)
            {
            a[i] = sc.nextInt();
        }
        for(int j=N-1;j>=0;j--)
            {
            minE = (minE+a[j] + 1)/2;
        }
        System.out.println(minE);
        
    }
}