package Java_6_Operators;

public class LogicalOperator {
	public static void main(String[] args) {
		int x = 10;
		
		System.out.println(x > 4 && x < 11); // Returns true if both statements are true And Returns false if both statements are false
		
		int y = 11;
		System.out.println(y > 10 || y < 3);  // Returns true if one of the statements is true And if both statement are false then returns false
		
		int z = 12;
		System.out.println(!(z > 1 && z < 14)); // Reverse the result, returns false if the result is true
	}
}
