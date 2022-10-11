package Java_27_Innter_Class;

/*Unlike a "regular" class, an inner class can be private or protected. If you don't want
 *  outside objects to access the inner class, 
 * declare the class as private:*/


class OuterClass1{
	int x =8;
	
	private class InnerClass2{
		int y = 8;
	}
}


public class PrivateInnerClass {
	
	public static void main(String[] args) {
		
		OuterClass1 myOuter = new OuterClass1();
		
		//OuterClass1.InnerClass2 myInner = myOuter.new InnerClass2();
		
		//System.out.println(myInner.y + myOuter.x);
	}
}

/*If you try to access a private inner class from an outside class, an error occurs:

Main.java:13: error: OuterClass.InnerClass has private access in OuterClass
    OuterClass.InnerClass myInner = myOuter.new InnerClass();*/