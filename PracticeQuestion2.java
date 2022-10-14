package Variables_DataTypes_6;

/*In a program,input the side of a square.You have to output the area of the square*/

import java.util.*;

public class PracticeQuestion2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side of a square:");
		
		float side = sc.nextFloat();
		
		float area_square = side * side;
		
		System.out.println("The area of the square is:" + " " + area_square);
	}
}
