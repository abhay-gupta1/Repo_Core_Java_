package Java_10_IfElse;

/*Short Hand If...Else
There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:*/

/*Syntax
variable = (condition) ? expressionTrue :  expressionFalse;*/

public class TernaryOperator {
	public static void main(String[] args) {
		int time = 13;                                              /*Insert the missing parts to complete the following 
		                                                              "short hand if...else statement" (ternary operator):*/
		String result = (time < 18) ? "Good Day." : "Good Evening.";
		System.out.println(result);
	}
}
