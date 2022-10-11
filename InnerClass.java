package Java_27_Innter_Class;

/*In Java, it is also possible to nest classes (a class within a class). 
 * The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

To access the inner class, create an object of the outer class, and then create an object of the inner class*/



class OuterClass{
	int x = 10;
	
  class InnerClass1{	
	  int y = 9;
  }
}

public class InnerClass {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		
		OuterClass.InnerClass1 myInner = myOuter.new InnerClass1();
		
		System.out.println(myInner.y + myOuter.x);
	}
}

