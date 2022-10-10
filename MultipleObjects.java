package Java_21_Class_Attributes;

/*If you create multiple objects of one class, 
 * you can change the attribute values in one object, without affecting the attribute values in the other:*/

public class MultipleObjects {
	
	int d = 9;
	
	public static void main(String[] args) {
		
		MultipleObjects multiObj1 = new MultipleObjects();
		
		MultipleObjects multiObj2 = new MultipleObjects();
		
		multiObj2.d = 78;
		System.out.println(multiObj1.d);
		System.out.println(multiObj2.d);
	}
}
