package Java_18_Scope;

/*In Java, variables are only accessible inside the region they are created. This is called scope.*/

public class MethodScope {

	// Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared:
	
	public static void main(String[] args) {

	    // Code here CANNOT use x

	    int x = 100;

	    // Code here can use x
	    System.out.println(x);
	  }
}
