// Q.1 WRITE A JAVA PROGRAM TO READ 3 LINES FEOM A FILE
package LAB;
import java.io.*;
public class QS_1 {

	public static void main(String[] args) throws Exception{
		String lineString = null;
		BufferedReader b1 = new BufferedReader(new FileReader("Test.txt"));
		int i=0;
		while (((lineString= b1.readLine()) !=null)&& i<3) {
			System.out.println(lineString);
			i++;
		}
		b1.close();

	}

}
