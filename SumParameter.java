package Java_17_MethodParmeters;

import java.util.Scanner;

/*returns the sum of a method's two parameters:*/
public class SumParameter {
	static int sumMethod(int x, int y) {
		return x + y;
	}
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the value of x");
		
		int x = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the value of y");
		
		int y = sc2.nextInt();
		
		System.out.println(sumMethod(x,y));
	}
}
