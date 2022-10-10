package Java_21_Class_Attributes;

/*If you don't want the ability to override existing values, declare the attribute as final:*/

public class FinalAttribute {
	final int j = 5;
	
	public static void main(String[] args) {
		
		FinalAttribute finalAtb = new FinalAttribute();
		
		// finalAtb.j = 9; // will generate an error: cannot assign a value to a final variable
		
		System.out.println(finalAtb.j);
	}
}

/*The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

The final keyword is called a "modifier". */