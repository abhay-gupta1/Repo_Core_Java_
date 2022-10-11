package Java_Polymorphism;

/*Polymorphism means "many forms", and it occurs when we have many 
 * classes that are related to each other by inheritance.

Like we specified in the previous chapter; Inheritance lets us inherit
 attributes and methods from another class. Polymorphism uses those methods to perform different tasks.
  This allows us to perform a single action in different ways.*/

/*For example, think of a superclass called Animal that has a method called animalSound(). 
 * Subclasses of Animals could be Pigs, Cats, Dogs, Birds -
 *  And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):*/
class Polymorphism {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
	
}


class Cats extends Polymorphism{
	
	public void animalSound() {
		System.out.println("The pig says: Meaw Meas");
	}
}

class Dog extends Polymorphism{
	public void animalSound() {
		System.out.println("The dog says: bow bow");
	}
}
/*Now we can create Pig and Dog objects and 
call the animalSound() method on both of them:*/

class Main{
	public static void main(String[] args) {
		
		Polymorphism myPolymorphism = new Polymorphism();
		Polymorphism myCats = new Cats();
		Polymorphism myDog = new Dog();
		
		myPolymorphism.animalSound();
		myCats.animalSound();
		myDog.animalSound();
		
	}
} 

//Why And When To Use "Inheritance" and "Polymorphism"?
//- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.