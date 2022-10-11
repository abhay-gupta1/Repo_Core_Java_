package Java_27_Innter_Class;

/*An inner class can also be static, which means that you can access it without 
 * creating an object of the outer class:*/



class OuterClass3{
	int x = 98;
	
	static class InnerClass3{
		int y = 2;
	}
}


public class StaticInnerClass {
	public static void main(String[] args) {
		OuterClass3 myOuter = new OuterClass3();
		OuterClass3.InnerClass3 myInner = new OuterClass3.InnerClass3();
		
		System.out.println(myInner.y + myOuter.x);
	}
}
