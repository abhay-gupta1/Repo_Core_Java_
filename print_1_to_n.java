package Loops_Flow_Control_9;

import java.util.*;

public class print_1_to_n {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit(n):");
		
		int n = sc.nextInt();
		
		int counter = 1;
		
		while(counter <= n) {
			
			System.out.print(counter + " ");
			
			counter++;
		}
	}
}
