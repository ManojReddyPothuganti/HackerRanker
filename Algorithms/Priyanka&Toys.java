import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] w = new int[n];
        for(int i=0 ;i<n;i++)
            {
            w[i] = sc.nextInt();
        }
        Arrays.sort(w);
        int count = 0;
        for(int i=0;i<n;++count)
            {
            int maxw = w[i] + 4 ;
            while(++i < n && w[i] <= maxw){}
            //System.out.println(count);
        }
        System.out.println(count);
    }
}