package Java_15_Methods;

public class MultiTypeMethod {
	
//	static void MultiMethod() {
//		System.out.println("this is multi method");
//	}
//	
//	public static void main(String[] args) {
//		
//		MultiMethod();
//		MultiMethod();
//		MultiMethod();
//	}
	
	private int a;
	private static int count;
	
	public void setData()
	{
		a=count++;
		
	}
	public void display()
	{
		System.out.println("a="+a);
		System.out.println("Count="+count);
	}
}

