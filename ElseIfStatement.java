package Java_10_IfElse;

/*Use the else if statement to specify a new condition if the first condition is false.*/

import java.util.*;

public class ElseIfStatement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x");
		
		int x = sc.nextInt();
		
		if (x >100) {
			System.out.println("x is greater than 100");
		}
		else if (x < 100) {
			System.out.println("x is less than 100");
		}
		else {
			System.out.println("Please enter a valid value of x");
		}
	}
}
