package Java_3_Variables;
/*7. If you don't want others (or yourself) to overwrite existing values, use the final keyword 
 * (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
 */

public class FinalVariable {
	public static void main(String[] args) {
		final int FinalNum= 12;
		//FinalNum = 10;      /*will generate an error: cannot assign a value to a final variable*/
		System.out.println(FinalNum);
	}
}
