package Operators_7;

public class Practice_Question2 {
	public static void main(String[] args) {
		
		int x = 200, y = 50, z = 100;
		
		if(x > y && y > z) {
			System.out.println("Hello");
		}
		if(x > y && z < x) {
			System.out.println("Java");
		}
		if((y + 200) < x && (y + 150) < z) {
			System.out.println("Hello Java");
		}
	}
}