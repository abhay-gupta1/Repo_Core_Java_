package Java_22_Class_Methods;

/*You will often see Java programs that have either static or public attributes and methods.

In the example above, we created a static method, 
which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:*/
public class Static_Public {
	
	static void myStaticMethod() {
		
		System.out.println("Static methods can be called without creating objects");
	}
	
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}
	
	public static void main(String[] args) {
		
		myStaticMethod();
		
		Static_Public myObj = new Static_Public();
		
		myObj.myPublicMethod();
	}
}
