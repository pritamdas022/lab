//Q.3Write a Java program to find sequences of lowercase letters joined with a underscore.
package String;
import java.util.regex.Pattern;
public class string3 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("^[a-z]+_[a-z]+", "java_exersices"));// true
		System.out.println(Pattern.matches("^[a-z]+_[a-z]+", "Java_Exersices"));// false

	}

}
