package Java_24_Modifiers;

/*An abstract method belongs to an abstract class, and it does not have a body. 
 * The body is provided by the subclass:*/

abstract class Abstract_Non_Access_Modifiers {
	
	public String fname = "Abhay";
	public int age = 23;
	public abstract void study(); // abstract method
}

// Subclass (inherit from Main)

class Student extends Abstract_Non_Access_Modifiers{
	
	public int graduationYear = 2021;
	
	public void study() { // // the body of the abstract method is provided here
	
		System.out.println("Studying all day long");
	}
}

//End code from filename: Abstract_Non_Access_Modifiers.java

//Code from filename: Second.java

