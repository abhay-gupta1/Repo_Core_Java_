package Variables_DataTypes_6;

/*Enter cost of 3 items from the user (using float datatype)-a pencil,a pen and an eraser. You have to output the total cost of
 *  the items back to the user as their bill.
 *  (Add on : You can also try adding 18% gst tax to the items in the bill) */

import java.util.*;

public class PracticeQuestion3 {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the cost of pencil:");
		float pencil = sc.nextFloat();
		
		System.out.println("Enter the cost of pen");
		float pen = sc.nextFloat();
		
		System.out.println("Enter the cost of eraser");
		float eraser = sc.nextFloat();
		
		float sum = (pencil + pen + eraser);
		
		System.out.println("Total cost is:"+" "+ sum);
		 
		float totalcostwithgst = sum + (sum * 18) /100;
		
		System.out.println("The total cost of all items with gst:" +" "+ totalcostwithgst);
		
		
	}
}
