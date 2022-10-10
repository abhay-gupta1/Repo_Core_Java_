package Java_17_MethodParmeters;

import java.util.Scanner;

public class IfElseMethod {
// Create a checkAge() method with an integer variable called age
	
	static void checkAge(int age) {
		
		if(age < 18) {
			
			System.out.println("Access Denied");
		}
		
		else {
			System.out.println("Access Granted");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age");
		
		int x = sc.nextInt();
     		
		checkAge(34);
	}
}
