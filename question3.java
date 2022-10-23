package Conditional_Statements_8;

/*Write a Java program to input week number(1-7) and print day of week name*/
import java.util.*;

public class question3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day number:");
		
		int day = sc.nextInt();
		
		switch(day) {
		
		case 1:
			System.out.println("Sunday");
			break;
			
		case 2:
			System.out.println("Monday");
			break;
		
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thrusday");
			break;	
			
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;	
			
		default:
			System.out.println("Invalid input! Please enter week number between 1-7.");
		}
	}
}
