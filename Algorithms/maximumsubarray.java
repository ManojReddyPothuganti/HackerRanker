import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		
		// Get the no of test cases
		final int T = in.nextInt();
		for(int i = 0; i  < T; i++) {
			
			// Initialize max sum of not necessary contagious elements to MIN value of 
			// integer to cater to accommodate negative values as well
			int maxSumElems = Integer.MIN_VALUE;
			// Initialize max sum of contagious elements to MIN value of 
			// integer to cater to accommodate negative values as well
			int maxSumOfContiElems = Integer.MIN_VALUE;
			
			// Represents the sum of elements up to current index
			int sumOfPrevContiElems = 0;
			
			// Get the number of elements in Array
			final int N = in.nextInt();
			for(int j = 0; j < N; j++) {
				final int elem = in.nextInt();
				
				// If previous sum is negative, we reset it to zero as we need to calculate max sum 
				// of contagious elements. If we include negative sum, our total sum will be less. Hence
				// will get rid of negative sum as we go.
				if(sumOfPrevContiElems < 0) {
					sumOfPrevContiElems = 0;
				}
				
				// Add current element to sum of previous contagious elements
				sumOfPrevContiElems+= elem;
				
				// Update the max sum of contiguous elements with previous contagious sum only if it is lesser
				if(sumOfPrevContiElems > maxSumOfContiElems) {
					maxSumOfContiElems = sumOfPrevContiElems;
				}
				
				// Work out the max sum of non-contagious (not-necessary contagious) elements as follows -
				// 1. If we have positive numbers then it is simply sum of all positive numbers
				// 2. Else it is the max negative number as adding two negative number always leads to less number.
				
				// Hence, we first check if current element is positive - 
				// - If yes, we check if we have had positive numbers till current element by checking current max Sum
				// 		- If current max sum is positive, we add current element to current max sum
				//		- Else, we discard the current max sum as it was negative and assign it to current element. 
				// - Else, we assign max sum to max of current sum and current element
				if(elem > 0) {
					if(maxSumElems < 0) {
						maxSumElems = elem;
					} else {
						maxSumElems += elem;
					}
				} else {
					if(maxSumElems < 0) {
						maxSumElems = Math.max(elem, maxSumElems);
					}
				}
				
			}
			
			System.out.println(maxSumOfContiElems + " " + maxSumElems);
		}
		
		in.close();
}
}