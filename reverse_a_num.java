package Loops_Flow_Control_9;

public class reverse_a_num {
	public static void main(String[] args) {
		
		int n = 10899;
		
		while( n > 0) {
			
			int lastdigit = n % 10;
			
			System.out.print(lastdigit);
			
			n = n / 10;
		}
		
		
	}
	
}
