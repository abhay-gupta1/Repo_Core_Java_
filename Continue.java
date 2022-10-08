package Java_13_ForLoop;

import java.util.*;

/*The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.*/

public class Continue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x");
		
		int x = sc.nextInt();
		
		for(x = 0; x <= 10; x++) {
			if(x == 4) {
				continue;
			}
			System.out.println(x);
		}
	}
}
