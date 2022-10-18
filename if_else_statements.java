package Conditional_Statements_8;

import java.util.*;
public class if_else_statements {
	public static void main(String[] args) {
		
		int age = 17;
		
		if(age >= 18) {
			
			System.out.println("adult Vote and drive");
		}
		if(age > 13 && age < 18) {
			
			System.out.println("Teenager");
		}
		
		else {
			
			System.out.println("Not Adult");
		}
	}
}
