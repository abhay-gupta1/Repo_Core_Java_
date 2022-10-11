package Java_24_Modifiers;
/*If you don't want the ability to override existing attribute values, 
 * declare attributes as final:*/

public class Final_Non_Access_Modifier {
	final int x = 90;
	final double PI = 3.14;
	
	public static void main(String[] args) {
		Final_Non_Access_Modifier myObj = new Final_Non_Access_Modifier();
		
		//myObj.x = 78; // will generate an error: cannot assign a value to a final variable
	    //myObj.pi = 25; // will generate an error: cannot assign a value to a final variable
		
		
		System.out.println(myObj.x);
		
	}
}
