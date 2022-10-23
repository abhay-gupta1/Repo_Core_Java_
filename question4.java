package Conditional_Statements_8;

// What will be the value of x & y in the following program:
public class question4 {
	public static void main(String[] args) {
		
		int a = 63, b = 36;
		
		boolean x = (a < b) ? true : false;
		System.out.println(x);
		
		int y = (a > b) ? a : b;
		System.out.println(y);
	}
}
