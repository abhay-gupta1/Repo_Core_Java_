package Loops_Flow_Control_9;

// Write a program to find the factorial of any number entered by the user.
import java.util.*;
public class Practice_Question3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num; // To hold number
		
		int fact = 1; // To hold factorial
		
		System.out.println("Enter any positive integer:");
		
		num = sc.nextInt();
		
		
		for(int i = 1; i <= num; i++) {
			//fact *= i;
			
			fact = fact * i;
		}
		
		System.out.println("Factorial:" +" "+fact);
	}
}
