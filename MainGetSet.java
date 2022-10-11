package Java_25_Encapsulation;

public class MainGetSet {
	public static void main(String[] args) {
		
		GetAndSet myObj = new GetAndSet();
		
		myObj.setName("Abhay");
		
		System.out.println(myObj.getName());
		
	}
}

/* Why Encapsulation?
1. Better control of class attributes and methods
2. Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
3. Flexible: the programmer can change one part of the code without affecting other parts
4. Increased security of data
*/