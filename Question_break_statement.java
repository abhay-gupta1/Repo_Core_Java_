package Loops_Flow_Control_9;

import java.util.*;

public class Question_break_statement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Enter the number(n):");
		 * 
		 * 
		 * for(int n = sc.nextInt(); n <= 1000; n++) {
		 * 
		 * if(n % 10 == 0) {
		 * 
		 * break; }
		 * 
		 * System.out.println(n); } System.out.println("Exit");
		 */

		do {
			System.out.println("Enter your number(n):");
			int n = sc.nextInt();

			if (n % 10 == 0) {
				break;
			}
			System.out.println(n);
		} while (true);
		
		System.out.println("Exit");
	}
}
