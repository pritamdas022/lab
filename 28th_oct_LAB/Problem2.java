/*Problem code 3:
Take two numbers x and y. Throw the exception if the two numbers are negative else print
the
Product of x and y.
Input Format
The only line of input consist of two integers, x and y.
Constraints ----- -20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero.*/
package LAB;
import java.util.*;
// main class
public class Problem2 {
// main method
	public static void main(String[] args) {
//		scanner class
		Scanner sc = new Scanner(System.in);
//		user input 1
		System.out.println("Enter integer 1 : ");
		int x = sc.nextInt();
//		user input 2
		System.out.println("Enter integer 2 : ");
		int y = sc.nextInt();
//		condition 1
		if (x<0&&y<0) {
//			try catch block 1
			try {
				throw new Exception("both numbers are negative");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
//			second condition
			}else if (x>1&&y>1) {
				System.out.println("product of numbers is: "+x*y);
		}else {
//			try catch block 2
			try {
				throw new Exception("x and y shold not be zero");
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
