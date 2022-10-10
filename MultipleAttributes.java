package Java_21_Class_Attributes;

/*You can specify as many attributes as you want:*/

public class MultipleAttributes {
	
	String fname = "Jhon";
	String lname = "Doe";
	int age = 87;
	
	public static void main(String[] args) {
		
		MultipleAttributes multiAtb = new MultipleAttributes();
		
		System.out.println("Name :" + multiAtb.fname + " " + multiAtb.lname);
		System.out.println("Age:" + multiAtb.age);
	}
}
