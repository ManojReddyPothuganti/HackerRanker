import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int loses = sc.nextInt();
        int[] games = new int[n];
        int[] status = new int[n];
        int count = 0;
        TreeSet<Integer> set = new TreeSet<Integer>();
        int sum = 0;
        for(int j =0,k=0 ;j<n;j++)
            {
            games[j] = sc.nextInt();
            status[j] = sc.nextInt();
            if(status[j] == 0)
                {
                sum = sum + games[j];
            }
            else
                {
                count = count + 1 ; 
                //set.add(games[j]);
                //System.out.println(set);
            }
        }
        int[] win = new int[count];int z =0; 
        for(int j = 0 ;j<status.length;j++ )
            {
            if(status[j] == 1)
                {
                win[z] = games[j];z++ ;
                //System.out.println(win[j]);
                
            }
        }
        Arrays.sort(win);
        for(int i = win.length- 1 ;i >= 0 ;i--)
            {
            //System.out.println(win[i]);
            if(loses > 0)
                {
                    
                    sum = sum + win[i];loses--;
                }
            else
                {
                //System.out.println("Subtract");
                sum = sum - win[i];
            }
        }
        
       
        
        System.out.println(sum);
    }
}