/*we need to print the elements of the array which are present in odd positions. This can
be accomplished by looping through the array and printing the elements of an array by
incrementing i by 2 till the end of the array is reached.*/
package String;
import java.util.*;
public class odd_position {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements of an array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 1; i < arr.length; i=i+2) {
			System.out.println(arr[i]);
		}

	}

}
