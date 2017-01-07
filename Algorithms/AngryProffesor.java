import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input  STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
        List<String> array = new ArrayList<String>();
            while(n>0)
                {
                int length = sc.nextInt();//System.out.println(length + "  :lenght");
                int k = sc.nextInt();//System.out.println("k : " + k);
                int result = 0;
                    for(int i = 0;i<length;i++)
                    {
                        int time = sc.nextInt();
                       // System.out.println(time);
                    if(time <= 0)
                        {
                            result++;
                        }
                      
                    }
                if(result >= k)
                          {
                             array.add("NO");//System.out.println("No");
                          }
                else{array.add("YES");}//System.out.println("Yes");}
                     n--;
            }
        for(String x : array)
            {
            System.out.println(x);
        }
    }
}