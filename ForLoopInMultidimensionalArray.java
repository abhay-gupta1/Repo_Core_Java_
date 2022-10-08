package Java_14_Array;

/*We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):*/
import java.util.*;
public class ForLoopInMultidimensionalArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of i");
		int i = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the value of j");
		int j = sc1.nextInt();
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    for ( i=0 ; i < myNumbers.length; ++i) {
	      for(j = 0; j < myNumbers[i].length; ++j) {
	        System.out.println(myNumbers[i][j]);
	      }
	    }
	}
}
