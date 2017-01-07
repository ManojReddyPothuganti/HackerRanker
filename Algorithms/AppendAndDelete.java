import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int slength = s.length();
        int tlength = t.length();
        int index =0;
        int i=0;
        int count=0;
        if(slength<=tlength)
            {
            count=slength;
        }
        else
            {
            count=tlength;
        }
        for (i=0;i<count;i++)
            {
                if(s.charAt(i)==t.charAt(i))
                    {
                    continue;
                }
                else
                    {
                    break;
                }
  
            }
        if((k-((s.length()-i)+(t.length()-i)))>=0)
            {
            System.out.println(k-((s.length()-i)+(t.length()-i)));
             if((k-(s.length()-i)+(t.length()-i))%2==0)
            {
            System.out.println("Yes");
            }
        }
        else
            {
            System.out.println("No");
        }
                
    }
}
