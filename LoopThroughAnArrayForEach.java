package Java_14_Array;

/*There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
 
 Syntax
 
for (type variable : arrayname) {
  ...
}
*/

public class LoopThroughAnArrayForEach {
	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	    for (String i : cars) {
	      System.out.println(i);
	}
}
}