package Java_11_Switch;

/*The default keyword specifies some code to run if there is no case match:*/

import java.util.*;

public class DefaultKeyword {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day: "+" ");
		
		int day = sc.nextInt();
		
		switch(day) {
		
		case 6:
			System.out.println("Saturday");
		break;
		
		case 7:
			System.out.println("Sunday");
		break;
		
		default:
			System.out.println("Looking forward for weekend");
			
		}
	}
}
