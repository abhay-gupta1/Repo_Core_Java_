package Java_17_MethodParmeters;

import java.util.Scanner;

public class SumParameter1 {

	static int sumMethod1(int x, int y, int z) {
		
		return z = x + y;
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the value of y");
		int y = sc1.nextInt();
		
        Scanner sc2 = new Scanner(System.in);
		
		int z = sc2.nextInt();
		
		//int z = sumMethod1(4,5);
		
		System.out.println(sumMethod1(x,y,z));
	}
}
