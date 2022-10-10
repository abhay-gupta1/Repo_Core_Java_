package Java_17_MethodParmeters;

/*Information can be passed to methods as parameter. Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses. 

You can add as many parameters as you want, just separate them with a comma.

The following example has a method that takes a String called fname as parameter. 

When the method is called, we pass along a first name, which is used inside the method to print the full name:*/
public class ParametersAndArguments {

	static void paMethod(String fname, String midname) {
		
		System.out.println(fname +" "+ midname +" "+ "Gupta");
		
	}
	public static void main(String[] args) {
		
		paMethod("Abhay", "Prakash");
		
	}
}

/*When a parameter is passed to the method, it is called an argument.
 *  So, from the example above: fname and midname is a parameter, while Abhay and Prakash are arguments*/
 
class MultipleParameters {
	
	static void mpMethod(String fname1,int age) {
		
		System.out.println(fname1 +" "+ age);
	}
	public static void main(String[] args) {
		
		mpMethod("Abhay", 22);
		/*Note that when you are working with multiple parameters, 
		 * the method call must have the same number of arguments as there are parameters,
		 *  and the arguments must be passed in the same order.*/
	}
}

