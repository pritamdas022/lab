// Write a Java program to test if an array contains a specific value.
package String;
import java.util.*;

public class specificVAL {
	public static boolean specific(int []array,int item) {
		for (int n:array) {
			if (item==n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the specific number : ");
		int n = sc.nextInt();
		
		int array[]={1789,2004,2001,1456,3567,8974};
		
		System.out.println(specific(array, n));

	}

}
