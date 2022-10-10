package Java_23_Constructors;

/*You can have as many parameters as you want:*/

public class Constructor_Many_Parameter {
	
	int modelYear;
	String modelName;
	
	public Constructor_Many_Parameter(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	
	public static void main(String[] args) {
		
		Constructor_Many_Parameter myCar = new Constructor_Many_Parameter(1967, "Mustang");
		
		System.out.println(myCar.modelYear + " " + myCar.modelName);
		
		
	}
}
