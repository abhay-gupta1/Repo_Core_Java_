package Java_26_Package_API;

/*In Java, it is possible to inherit attributes and methods from one class to another.
 *  We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.

In the example below, the Car class (subclass) inherits the attributes
and methods from the Vehicle class (superclass)*/

class Vehicle {     
	public String brand = "Ford"; // Inheritance attribute
	
	public void honk() {                  // Inheritance method
		System.out.println("Tuut, tuut!");
	}
}

class Car extends Vehicle {
	private String modelName = "Mustang"; // Car attribute
	
	public static void main(String[] args) {
		
		Car myFastCar = new Car(); //Create a myCar object
		
		// Call the honk() method (from the Vehicle class) on the myCar object
		myFastCar.honk();
		
		// Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	}
	
}
