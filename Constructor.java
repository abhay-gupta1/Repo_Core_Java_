package Java_23_Constructors;

/*A constructor in Java is a special method that is used to initialize objects. 
 * The constructor is called when an object of a class is created.*/

public class Constructor {
	
	int x; // Create a class attribute
	
	public Constructor() {        // Create a class constructor for the Main class
		
		x = 9;              // Set the initial value for the class attribute x
	}
	
	public static void main(String[] args) {
		
		Constructor myObj = new Constructor();
		
		// Create an object of class Main (This will call the constructor)
		
		System.out.println(myObj.x);
		
	}
}

/*Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, 
Java creates one for you. However, then you are not able to set initial values for object attributes.*/