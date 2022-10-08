package Java_13_ForLoop;

import java.util.*;

/*When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:*/

/*
Syntax

for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
*/

/*Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.*/

public class ForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the value of i");
		System.out.println("Enter the value of x");
		
		int i = sc.nextInt();
		int x = sc.nextInt();
		
		for(i = 0; i < 5; i++ ) {
			System.out.println(i);
		}
		
		for(x = 0; x <= 10; x = x + 2) {   // This example will only print even values between 0 and 10:
			System.out.println(x);
		}
	}
}
/*Example explained
Statement 1 sets a variable before the loop starts (int i = 0).

Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true, the loop will start over again, if it is false, the loop will end.

Statement 3 increases a value (i++) each time the code block in the loop has been executed.*/