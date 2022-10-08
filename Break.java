package Java_13_ForLoop;

/*
You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.

The break statement can also be used to jump out of a loop.

This example stops the loop when i is equal to 4:
*/

import java.util.*;

public class Break {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of i");
		
		int i = sc.nextInt();
		
		for (i = 0; i <= 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
	}
}
