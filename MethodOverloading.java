package Java_16_MethodOverloading;

// With method overloading, multiple methods can have the same name with different parameters:

//int myMethod(int x)
//float myMethod(float x)
//double myMethod(double x, double y)

// Consider the following example, which has two methods that add numbers of different type:

public class MethodOverloading {

		static int plusMethodInt(int x, int y) {
			
			return x + y;
		}
		
		static double plusMethodDouble(double x, double y) {
			
			return x + y;
		}
		
		public static void main(String[] args) {
			
			int myNum = plusMethodInt(4,5);
			double myNum1 = plusMethodDouble(2.5,3.4);
			
			System.out.println("int:" + myNum);
			System.out.println("double:" + myNum1);
		}
}
