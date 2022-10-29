package Loops_Flow_Control_9;

import java.util.*;

public class prime_or_not_approach2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number(n):");
		
		int n = sc.nextInt();
		
		if(n == 2) {
			
			System.out.println("Prime Number");
		}
		else {
			
			boolean isPrime = true;
			
			for(int i = 2; i <= Math.sqrt(n); i++) {
				
				if(n % i == 0) {
					
					isPrime = false;
				}
			}
			
			if(isPrime == true) {
				System.out.println("n is a prime number");
				
				}
			else {
				System.out.println("not a prime number");
			}
			}
		
	}
}
