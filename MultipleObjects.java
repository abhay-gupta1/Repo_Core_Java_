package Java_20_OOPS;

// You can create multiple objects of one class:
public class MultipleObjects {

	int x = 43;
	int y = 34;
	int z;
	
	public static void main(String[] args) {
		
		MultipleObjects myObj1 = new MultipleObjects();
		MultipleObjects myObj2 = new MultipleObjects();
		
		System.out.println(myObj1.x);
		System.out.println(myObj2.y);
	}
}
