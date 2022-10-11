package Java_24_Modifiers;

/*For classes, you can use either final or abstract:

Modifier:	Description	Try it
final:	The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)	
abstract:	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters)	
For attributes and methods, you can use the one of the following:

Modifier"	Description
final:	Attributes and methods cannot be overridden/modified
static:	Attributes and methods belongs to the class, rather than an object
abstract:	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
transient:	Attributes and methods are skipped when serializing the object containing them
synchronized:	Methods can only be accessed by one thread at a time
volatile:	The value of an attribute is not cached thread-locally, and is always read from the "main memory"*/

public class Non_Access_Modifiers {

}
