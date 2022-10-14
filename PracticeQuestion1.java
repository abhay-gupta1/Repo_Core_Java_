package Variables_DataTypes_6;

/*In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers.*/

import java.util.*;
public class PracticeQuestion1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first num:");
		int x = sc.nextInt();
		
		System.out.println("Enter the second num:");
		int y = sc.nextInt();
		
		System.out.println("Enter the third num:");
		int z = sc.nextInt();
		
		int average = (x + y + z)/3;
		
		System.out.println("The average of three numbers are:" + " " + average);
	}
}
