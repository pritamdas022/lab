/*Create a class MyCalculator which consists of a single method long power(int, int).
This method takes two integers, n and p, as parameters and finds n^p . If either n or
p is negative, then the method must throw an exception which says "n or p should
not be negative.". Also, if both n and p are zero, then the method must throw an
exception which says "n and p should not be zero.*/

package ExceptionHandeling;

import java.util.Scanner;
// main class
public class Mycalculator {
//	method
	public long power(int n,int p) throws Exception{
		if(n<0||p<0) {
			throw new Exception("n and p should not be negative");
		}else {
			if (n==0||p==0) {
				throw new Exception("n or p shold not be zero");
			}else {
				return(long)Math.pow(n, p);
			}
		}
	}
// main method
	public static void main(String[] args) {
//		creating object
		Mycalculator m1 = new Mycalculator();
//		scanner class object
		Scanner s1 = new Scanner(System.in);
//		user input
		int n = s1.nextInt();
		int p = s1.nextInt();
//	try catch block
		try {
			System.out.println(m1.power(n,p));// calling method
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
