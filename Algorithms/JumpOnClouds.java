import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int c[] = new int[N];
        for(int c_i=0; c_i < N; c_i++){
            c[c_i] = in.nextInt();
        }
        int result =0;
        int i =0;
        while(true) {
			if(i + 2 < N && c[i + 2] == 0) {
				i += 2;
			} else if(i + 1 < N) {
				i++;
			} else {
				break;
			}
			result++;
		}
        System.out.println(result);
    }
}
