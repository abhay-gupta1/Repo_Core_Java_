package Java_8_Math;

/*The Java Math class has many methods that allows you to perform mathematical tasks on numbers.*/

public class MathsOperations {
	public static void main(String[] args) {
		System.out.println(Math.max(5, 10));   // The Math.max(x,y) method can be used to find the highest value of x and y:
		
		System.out.println(Math.min(34, 234)); // The Math.min(x,y) method can be used to find the lowest value of x and y:
		
		System.out.println(Math.sqrt(64));     // The Math.sqrt(x) method returns the square root of x:
		
		System.out.println(Math.abs(-7.9));    // The Math.abs(x) method returns the absolute (positive) value of x:
		
		System.out.println(Math.random());     // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
		
		int randomnum = (int)(Math.random() * 101);
		System.out.println(randomnum); /* To get more control over the random number, e.g. you only want a random number 
		                                         between 0 and 100, you can use the following formula:*/
		
		System.out.println();
	}
}
