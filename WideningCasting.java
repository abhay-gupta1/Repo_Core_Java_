package Java_5_Type_Casting;

/* Widening casting --> is done automatically when passing a smaller size type to a larger size type:
 * Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double */

public class WideningCasting {
	public static void main(String[] args) {
		int myInt = 12;
		double myDouble = myInt;
		System.out.println(myInt);
		System.out.println(myDouble);
	}
}
