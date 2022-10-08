package Java_7_Strings;

/*There are many string methods available, for example toUpperCase() and toLowerCase():*/

public class MoreStringMethods {
	public static void main(String[] args) {
		String text = "Hello Abhay Gupta.";
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());

		String x = "10";
		String y = "20";
		String z = x + y;        // If you add two strings, the result will be a string concatenation
		System.out.println(z); 
		
		String a = "10";
		int  b = 24;
		String c = a + b;       // If you add a number and a string, the result will be a string concatenation
		System.out.println(c);
	}
}
