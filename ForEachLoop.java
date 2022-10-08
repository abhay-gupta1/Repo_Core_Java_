package Java_13_ForLoop;

import java.util.*;

/*There is also a "for-each" loop, which is used exclusively to loop through elements in an array:*/

/*
 Syntax
for (type variableName : arrayName) {
  // code block to be executed
}

*/
public class ForEachLoop {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the value of i");
		
		//int i = sc.nextInt();
		
		String[] cars = {"Volvo", "Audi", "BMW", "Ford"};
		
		for(String i : cars) {
			System.out.println(i);
		}
	}
}
