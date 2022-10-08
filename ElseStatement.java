package Java_10_IfElse;

import java.util.*;

public class ElseStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x");
		
		int x = sc.nextInt();
		
		System.out.println("Enter the value of y");
		int y = sc.nextInt();
		
		if(x > y) {
			System.out.println("Result : x is greater than y");
		}
		else {
			System.out.println("Result : x is not greater than y");
		}
	}
}
