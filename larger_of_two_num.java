package Conditional_Statements_8;

import java.util.*;

public class larger_of_two_num {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b:");
		
		int b = sc.nextInt();
		
		if(a > b) {
			
			System.out.println("a is largest");
		}
		else {
			
			System.out.println("b is largest");
		}
	}
}
