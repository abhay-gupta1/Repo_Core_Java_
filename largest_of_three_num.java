package Conditional_Statements_8;

import java.util.*;
public class largest_of_three_num {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		
		System.out.println("Enter the value of c:");
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			
			System.out.println("a is largest");
		}
		else if(b > c ) {
			System.out.println("b is largest");
		}
		else {
			System.out.println("c is largest");
		}
	}
}
