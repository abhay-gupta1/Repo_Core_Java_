package Java_12_WhileLoop;

import java.util.*;

/*You can also use continue in while loops:*/

public class ContinueStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of i");
		
		int i = sc.nextInt();
		
		while(i < 7) {
			if(i == 4) {
				i++;
			continue;	
			}
			System.out.println(i);
			i++;
		}
	}
	
}
