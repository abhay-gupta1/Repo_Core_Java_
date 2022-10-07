package Java_6_Operators;

/*Arithmetic operators are used to perform common mathematical operations.*/

public class ArithmeticOperators {
	public static void main(String[] args) {
		int x = 4;
		int y = 5;
		
		System.out.println(x + y);   //Addition
		System.out.println(x - y);	 //Subtraction
		System.out.println(x * y);   //Multiplication
		System.out.println(x / y);   //Division
		System.out.println(x % y);  
		
		int z = 6;
		++z;						 //Increment
		System.out.println(z);  
		
		int a = 7;
		--a;						 //Decrement
		System.out.println(a);
	}
}
