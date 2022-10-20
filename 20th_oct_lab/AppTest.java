// problem 3.Write a program in Java to create a file in Java using Exception Handling .
package ExceptionHandeling;

import java.io.File;
import java.io.IOException;
// main class
public class AppTest {
// main method
	public static void main(String[] args) {
//		try catch block
		try {
			File file = new File("c:\\Home\\eclipse\\java");
			if (file.createNewFile()) {
				System.out.println("File "+file.getName()+" is created");
			}else {
				System.out.println("File is already exist in this drive");
			}
		} catch (IOException e) {
			System.out.println("error is occur");
		}

	}

}
