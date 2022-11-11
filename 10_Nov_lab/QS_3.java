// WRITE A JAVA PROGRAM TO STORE TEXT FILE CONTENT LINE BY LINE INTO AN ARRAY.

package LAB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class QS_3 {

	public static void main(String[] args) throws Exception{
		ArrayList<String>list = new ArrayList<>();
		BufferedReader b1 = new BufferedReader(new FileReader("Demo.txt"));
		String currentLine;
		while ((currentLine = b1.readLine()) !=null) {
			list.add(currentLine);
			b1.close();
			System.out.println(list);
		}

	}

}
