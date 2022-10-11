package Java_File_Handling;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadAFile {
	public static void main(String[] args) {
		
		try {
			
			File myFile = new File("Abhay.txt");
			
			Scanner myReader = new Scanner(myFile);
			
			while (myReader.hasNextLine()) {
				
				String data = myReader.nextLine();
				System.out.println(data);
			}
			
			myReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An error occurred: file not found");
			e.printStackTrace();
		}
	}
}
