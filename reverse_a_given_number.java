package Loops_Flow_Control_9;

import java.util.*;

public class reverse_a_given_number {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n:");
		
		int n = sc.nextInt();
		
		int rev = 0;
		
		while(n > 0) {
			
			int lastdigit = n % 10;
			
			rev = (rev * 10) + lastdigit;
			n = n/10;
		}
		System.out.print(rev);
	}
}
