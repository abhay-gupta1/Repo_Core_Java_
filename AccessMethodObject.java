package Java_22_Class_Methods;

/**/
public class AccessMethodObject {
	
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}
	
	public void speed(int maxspeed) {
		System.out.println("Max Speed :" + maxspeed);
	}
	
	public static void main(String[] args) {
		
		AccessMethodObject myObj = new AccessMethodObject();
		
		myObj.fullThrottle();
		myObj.speed(200);
		
	}
}

/*Remember that..
The dot (.) is used to access the object's attributes and methods.

To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).

A class must have a matching filename (Main and Main.java).*/
