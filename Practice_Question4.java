package Loops_Flow_Control_9;

// Write a program to print the multiplication table of a number N,entered by the user.
import java.util.*;

public class Practice_Question4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for which you need to create multiplication table:");
		
		int n = sc.nextInt();
		//int table;
		
		for(int i = 1; i <= 10; i++) {
			
			//table = n * i;
			
			System.out.println(n +" "+"*"+" "+ i +" "+ "=" +" "+ n * i);
			
			//System.out.println(table);
		}
	}
}
