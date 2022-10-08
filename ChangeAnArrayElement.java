package Java_14_Array;

/*To change the value of a specific element, refer to the index number:*/

public class ChangeAnArrayElement {
	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		cars[0] = "Opel";
		
		System.out.println(cars[0]); // Now outputs Opel instead of Volvo
		
	}
}
