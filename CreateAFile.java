package Java_File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
		
	public static void main(String[] args) {
		
		try {
			
			File myFile = new File("Akash.txt");
			
			if(myFile.createNewFile()) {
				
				System.out.println("File Created:" + myFile.getName());
			}
			else {
				System.out.println("File already exist");
			}
		}
			catch(IOException e) {
				System.out.println("An error occured.");
				e.printStackTrace();
			}
		
	}
}
