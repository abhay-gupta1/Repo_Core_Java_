package Java_21_Class_Attributes;

/*override existing values:*/

public class OverrideAttribute {
	int y = 90;
	
	public static void main(String[] args) {
		
		OverrideAttribute overideAtb = new OverrideAttribute();
		
		overideAtb.y= 78;
		System.out.println(overideAtb.y);
	}
}
