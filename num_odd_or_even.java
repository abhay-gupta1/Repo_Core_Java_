package Conditional_Statements_8;

import java.util.*;

public class num_odd_or_even {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			
			System.out.println("Entered number is a even number");
		}
		
		else {
			
			System.out.println("Entered number is a odd number");
		}
	}
}
