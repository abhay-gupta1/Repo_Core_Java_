package Java_10_IfElse;
import java.util.*;

/*Use if to specify a block of code to be executed, if a specified condition is true
 * Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.
 * */
public class IfStatement {
	public static void main(String[] args) {
		/*if(19 > 4) {
			System.out.println("19 is greater than 4");
			
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x"); // We can also test variables:
		
		int x = sc.nextInt();
		
		System.out.println("Enter the value of y");
		int y = sc.nextInt();
		
		if(x != y) {
			System.out.println("x is not equal to y");
		}
		else {
			System.out.println("x is equal to y");
		}
	}
}
