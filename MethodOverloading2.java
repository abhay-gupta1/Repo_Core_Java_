package Java_16_MethodOverloading;

/*Instead of defining two methods that should do the same thing, it is better to overload one.

In the example below, we overload the plusMethod method to work for both int and double:*/

public class MethodOverloading2 {
	static int plusMethod(int x, int y) {
		return x + y;
	}
	
	static double plusMethod(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		int myNum = plusMethod(3,6);
		double myNum2 = plusMethod(3.5,3.6);
		
		System.out.println("int:" + myNum);
		System.out.println("double:" + myNum2);
	}
}

// Multiple methods can have the same name as long as the number and/or type of parameters are different.