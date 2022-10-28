/*Problem code 3
  write a method called addTwoPositive that takes two int parameters, and if either value is not positive, throw an ArithmeticException,
 * passing the string "Non-positive integer sent".to the constructor of the exception.if the the values are both positive,
 * then return the sum of them*/
package LAB;
import java.lang.*;
import java.util.Scanner;

// main class
public class Problem3 {
// main method
	public static void main(String[] args) {
//		scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1: ");
//		taking input 1
		int a = sc.nextInt();
		System.out.println("Enter number 2: ");
//		taking input 2
		int b = sc.nextInt();
		
		System.out.println(addTwoPositive(a,b));

	}
//	method
	public static int addTwoPositive(int a,int b) throws ArithmeticException{
		if (a<0||b<0) {
			throw new ArithmeticException("Non-positive ineger sent");// throw arithmetic exception
		}else {
			return a+b; // returning sum
		}
	}

}
