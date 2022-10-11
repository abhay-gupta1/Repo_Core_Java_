package Java_26_Package_API;

import java.util.Scanner;

/*we will use the nextLine() method, 
 * which is used to read a complete line:*/
public class Scanner_Class {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		
		String username = myObj.nextLine();
		System.out.println("Username is :" +" "+ username);
	}
}

