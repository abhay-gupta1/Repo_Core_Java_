package Loops_Flow_Control_9;

import java.util.*;

public class Question_continue_statement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter your number(n):");
			
			int n = sc.nextInt();
			
			if(n % 10 == 0) {
				continue;
			}
			System.out.println(n);
		}
		while(true);
		
	}
}
