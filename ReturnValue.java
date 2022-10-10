package Java_17_MethodParmeters;

import java.util.*;
/*The void keyword, used in the examples above, 
 * indicates that the method should not return a value. 
 * If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void,
 *  and use the return keyword inside the method*/

public class ReturnValue {
	static int returnMethod(int x) {
		return 5 + x;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x");
		
		int x = sc.nextInt();
		
		System.out.println(returnMethod(x));
	}
}
