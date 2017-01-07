import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int count  = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        for(int i=a[n-1];i<=b[0];i++)
            {
            int x =Solution.isfactorsA(a,i);
            int y =  Solution.isfactorsB(b,i);
            //System.out.println(i);
            if(x==1 && y==1)
                {
                count = count + 1 ;
                //System.out.println(i);
                }          
            
        }
        System.out.println(count);
        
    }
    public static int isfactorsA(int[] array,int ele)
        {
            int flag = 0;
        for(int j=0;j<array.length;j++)
                {
            //System.out.println("hello");
            //System.out.println(ele + "........." + array[j]);
                int x = ele%array[j];
            
                if(x == 0)
                    {
                      flag = 1;
                }
            else {flag =  0;}
            //System.out.println(flag);
        }
        return flag ;

        }
    
    
    public static int isfactorsB(int[] a,int ele )
        {
        int flag1=0;
        int x = 0;
        for(int j=0;j<a.length;j++)
                {
            
                 x = a[j]%ele ;
            //System.out.println(a[j] + "  element is " + ele + "  module is  "+ x);
                if(x == 0)
                    {
                     flag1 = 1;
                    //System.out.println(ele);
                    //System.out.println(ele + "................" + x);
                }
            else {flag1 = 0 ;break;}
        }
        return flag1 ;

        }

}