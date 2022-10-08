package Java_7_Strings;

public class SpecialCharacter {
	public static void main(String[] args) {
		String txt = "We are the so-called \"Vikings\" from the north."; /*The sequence \"  inserts a double quote in a string:
		  																   Because strings must be written within quotes, Java will
		                                                                   misunderstand this string, and generate an error:
		                                                                   The solution to avoid this problem, is to use the backslash escape 
		                                                                   character.*/
		System.out.println(txt);
		
		String str = "It\'s Alright";      /*The sequence \'  inserts a single quote in a string:*/
		System.out.println(str);
		
		String str1 = "The character \\ is called backslash.";  /*The sequence \\  inserts a single backslash in a string:*/
		System.out.println(str1);
		
		String str2 = "Hello \nAbhay";   // new line
		System.out.println(str2);
		
		String str3 = "Hello \rDeepak";  // Carriage Return
		System.out.println(str3);
		
		String str4 = "Hello \tAyan";    // Tab
		System.out.println(str4);
		
		String str5 = "Hel\blo Aman";   // BackSpace
		System.out.println(str5);
		
		String str6 = "Hello \fSameer"; // Form Feed
		System.out.println(str6);
	}
}
