package Java_12_WhileLoop;

/*Loops can execute a block of code as long as a specified condition is reached.

Loops are handy because they save time, reduce errors, and they make code more readable.*/

/*The while loop loops through a block of code as long as a specified condition is true:

Syntax
while (condition) {
  // code block to be executed
}

*/
import java.util.*;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x");
		
		int x = sc.nextInt();
		
		while(x <= 5) {
			System.out.println(x);
			x++;                  // Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!
		}
	}
}
