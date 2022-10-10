package Java_23_Constructors;

/*Constructors can also take parameters, which is used to initialize attributes.

The following example adds an int y parameter to the constructor.
 Inside the constructor we set x to y (x=y). When we call the constructor, 
 we pass a parameter to the constructor (5), which will set the value of x to 5:*/

public class Constructor_Parameter {

	int x;
	
	public Constructor_Parameter(int y) {
		x = y;
		
	}
	public static void main(String[] args) {
		
		Constructor_Parameter myObj = new Constructor_Parameter(5);
		
		System.out.println(myObj.x);
		
		
		
	}
}

