package classDemo;

import java.util.*;

public class Sample {

	public static void main(String[] args) {
		
		int array[] = {1, 2, 3, 4};
		
		int target = 8;
		
		int n = array.length;	
		
		for(int start=0; start<n; start++) {			
						
			for(int end=start+1; end<n+1; end++) {
				int sum = 0;
				System.out.print("[");
				//iterate start to end
				for(int i=start; i<end; i++) {
					System.out.print(array[i]);
					sum += array[i];
					if(i<end-1)
						System.out.print(",");
				}
				System.out.println("]" + " " + sum);
				
			}
		}
		
	}
}

/*

subarray problems
fixed size window
longest substring
maximum sum
continuous elements
*/