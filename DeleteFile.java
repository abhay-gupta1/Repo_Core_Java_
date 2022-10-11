package Java_File_Handling;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		
		File myFile = new File("Akash.txt");
		
		myFile.delete();
		
		//if(myFile.delete()) {
			//System.out.println("File deleted:" + myFile.getName());
		//}
		//else
			//System.out.println("An error occur while deleting the file");
	}
}
