//Q.3 write a java program that accepts two integers from the user and then prints the sum,the difference,the product,the average,the distance(the difference between integer),the maximum(the largest of two integers),the minimum(smaller of the two integers).

package JavaProgram;
import java.util.*;

public class ArithmeticExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input 1st integer : ");
		int a = sc.nextInt();
		System.out.print("Input 2nd integer : ");
		int b = sc.nextInt();
		
		System.out.println("Sum of two integer: "+(a+b));
		System.out.println("Difference of two integers: "+(a-b));
		System.out.println("Product of two integer: "+(a*b));
		System.out.println("Average of two integer: "+(a+b)/2);
		System.out.println("Distence of two integer: "+(a-b));
		System.out.println("Max integer: "+Math.max(a, b));
		System.out.println("min integer: "+Math.min(a, b));
		
		

	}

}
