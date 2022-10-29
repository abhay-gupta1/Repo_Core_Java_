package Loops_Flow_Control_9;

import java.util.*;

public class sum_of_n_natural_number {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range of natural number(n):");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		int counter = 1;
		
		while(counter <= n) {
			
			sum = sum + counter;
			
			counter ++;
			
			
		}
		System.out.println("sum is = " + sum);
	}
	
}
