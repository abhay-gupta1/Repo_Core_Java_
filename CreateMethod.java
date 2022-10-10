package Java_15_Methods;

/*A method must be declared within a class. It is defined with the name of the method, followed by parentheses ().
Java provides some pre-defined methods, such as System.out.println()*/

public class CreateMethod {
	
	 static void myMethod() {  /*static means that the method belongs to the Main class and not an object of the Main class.
	                             void means that this method does not have a return value.*/
		 System.out.println("This is myMethod");
	 }
	public static void main(String[] args) {
		myMethod();
	}	
}
