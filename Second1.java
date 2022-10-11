package Java_24_Modifiers;

public class Second1 {
	
		
		public static void main(String[] args) {
			
			Student myObj = new Student();
			
			System.out.println("Name:" + myObj.fname);
			System.out.println("Age:" + myObj.age);
			System.out.println("Graduation Year:" + myObj.graduationYear);
			myObj.study();
			
		}
		
	}
