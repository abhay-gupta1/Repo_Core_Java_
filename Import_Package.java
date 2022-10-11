package Java_26_Package_API;

public class Import_Package {
	
	public static void main(String[] args) {
		System.out.println("This is my package!");
	}
}

/*Import a Package
There are many packages to choose from. In the previous example, we used the Scanner class from the java.util package. 
This package also contains date and time facilities, random-number generator and other utility classes.

To import a whole package, end the sentence with an asterisk sign (*). 
The following example will import ALL the classes in the java.util package
*/

/*User-defined Packages
To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:

Example
└── root
  └── mypack
    └── MyPackageClass.java*/

/*This forces the compiler to create the "mypack" package.

The -d keyword specifies the destination for where to save the class file. You can use any directory name, 
like c:/user (windows), or, if you want to keep the package within the same directory, you can use the dot sign ".",
like in the example above.

Note: The package name should be written in lower case to avoid conflict with class names*/

