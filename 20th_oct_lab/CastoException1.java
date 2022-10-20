// problem 3.Write a program to create custom exception in java.
package ExceptionHandeling;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// extends throwable class
class customException extends Exception{
//	constructor
	public customException(String str) {
		super(str);// using super keyword
	}
}
// main class
public class CastoException1 {
	ArrayList<String> languages = new ArrayList<>(Arrays.asList("c++", "java", "Js","python","html"));

	  // check the exception condition
	  public void checkLanguage(String language) throws customException {

	    // throw exception if language already present in ArrayList
	    if(languages.contains(language)) {
	      throw new customException(language + " Already exists");
	    }
	    else {
	      // insert language to ArrayList
	      languages.add(language);
	      System.out.println(" Language added in the ArrayList");
	    }
	  }
// main method
	public static void main(String[] args)throws customException {
		CastoException1 m1 = new CastoException1();
		      m1.checkLanguage("js");
		      m1.checkLanguage("java");
		    
	}

}
