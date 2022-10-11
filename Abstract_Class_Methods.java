package Java_28_Abstraction;

/*Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces*/

/*The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is 
provided by the subclass (inherited from).*/

abstract class Abstract_Class_Methods {
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("Zzz");
	}
	
}

class dog extends Abstract_Class_Methods{
	public void animalSound() {
		
		System.out.println("The dog says");
	}
}

class Main{
	
	public static void main(String[] args) {
		dog myDog = new dog();
		
		myDog.animalSound();
		myDog.sleep();
	}
}

/*Why And When To Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.*/