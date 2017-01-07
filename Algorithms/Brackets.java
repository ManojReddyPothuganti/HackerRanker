

import java.util.Scanner;
import java.util.*;

public class Brackets {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] braces = new String[n];
		String[] results = new String[n];
		for(int i =0 ;i<n;i++)
		{
			braces[i] = sc.next();
			//System.out.println(braces[i]);
	
		}
		for(int i = 0 ;i<n;i++)
		{
			int x = Brackets.solution(braces[i]);
			if(x == 0)
			{
				results[i] = "No" ;
			}
			else{ results[i] = "YES" ;}	
		}
		for(int i =0 ;i<n;i++)
		{
			System.out.println(results[i]);
			}
		
	}


	public static int solution(String S) {
        // write your code in Java SE 8
         LinkedList<Character> stack = new LinkedList<Character>();
         
         for(int i=0;i<S.length();i++) {
             char c = S.charAt(i);
             
             if(c == '{' || c == '[' || c == '(') {
                 stack.push(c);
             } 
                          
                 else if(c == '}' || c == ']' || c == ')' ) {
                 if(stack.isEmpty()) {
                     return 0;
                 }
                 
                 char corresponding = stack.pop();
                 
                 if(c == ')' && corresponding != '(') {
                     return 0;
                 }
                 
                 if(c == ']' && corresponding != '[') {
                     return 0;
                 }
 
                 if(c == '}' && corresponding != '{') {
                     return 0;
                 }
 
             }
             else{ continue ;}
         }
         
         return stack.isEmpty() ? 1 : 0;
    }

}
