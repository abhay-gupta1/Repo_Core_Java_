package Java_21_Class_Attributes;

/*You can access attributes by creating an object of the class, and by using the dot syntax (.):

The following example will create an object of the Main class, 
with the name myObj. We use the x attribute on the object to print its value:*/
public class AccessingAttributes {
	
	int x = 8;
	
	public static void main(String[] args) {
		
		AccessingAttributes myAtb = new AccessingAttributes();
		
		System.out.println(myAtb.x);
	}
}
