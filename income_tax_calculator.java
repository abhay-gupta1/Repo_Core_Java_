package Conditional_Statements_8;

import java.util.*;
public class income_tax_calculator {
	public static void main(String[] args) {
		
		int tax;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the annual Income:");
		
		int income = sc.nextInt();
		
		if(income < 500000) {
			
			tax = (income * 0)/100;
			
			//System.out.println(tax);		
		}
		else if(income >= 500000 && income <= 1000000) {
			
			//tax = (income * 20)/100;
			
			tax = (int) (income * 0.2);
			
			//System.out.println(tax);
		}
		else {
			
			//tax = (income * 30)/100;
			
			tax = (int) (income * 0.3);
			
			//System.out.println(tax);
		}
			System.out.println("Your Tax is:" +" "+ tax );

	}

}
