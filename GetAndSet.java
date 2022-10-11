/**
 * You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.

The get method returns the variable value, and the set method sets the value.

Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:
 */
package Java_25_Encapsulation;

/**
 * @author abhay-gupta
 *
 */
public class GetAndSet {
	private String name;
	
	public String getName() {
		return name;
	}
	/**
	 * @param args
	 */
	
	public void setName(String newName) {
		this.name = newName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
