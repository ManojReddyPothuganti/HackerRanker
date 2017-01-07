import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int K=sc.nextInt();
        for(int i=0 ;i<N;i++)
            {
            arr[i] = sc.nextInt();
        }
        int swaps = 0;
        for(int i=0;i<N&&swaps<K;i++)
        {
        	int big=arr[i];
        	int pos=i;
        	boolean check=false;
        	for(int j=i+1;j<N;j++)
        	{
        		
        		if(big<arr[j])
        		{
        			big=arr[j];
        			pos=j;
        			check=true;
        		}
        		
        	}
        	if(check){
        		int temp;
        		temp=arr[i];
        		arr[i]=arr[pos];
        		arr[pos]=temp;
        		swaps++;
        	}
        
        	
        }
            
        for(int i=0;i<N;i++)
        {
        	System.out.print(arr[i]+" ");
        }
    }
}