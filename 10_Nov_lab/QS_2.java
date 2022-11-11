// Q.2 WRITE A JAVA PROGRAM TO FIND LONGEST WORD IN A FILE

package LAB;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class QS_2 {

	public static void main(String[] args) throws Exception {
		

	}
	public static String Longestword() throws FileNotFoundException{
		String longword = "";
		String currentword;
		Scanner sc = new Scanner(new File("Demo.txt"));
		while (sc.hasNext()) {
			currentword= sc.next();
			if(currentword.length()>longword .length()) {
				longword  = currentword;
			}
		}
		System.out.println(longword);
		return longword;
	}

}
