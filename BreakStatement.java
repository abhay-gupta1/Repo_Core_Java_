package Java_12_WhileLoop;

import java.util.*;

/*You can also use break*/

public class BreakStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of x");

		int x = sc.nextInt();

		while (x < 5) {
			System.out.println(x);
			x++;

			if (x == 3) {
				break;
			}
		}
	}
}