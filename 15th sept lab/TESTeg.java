/*Q.3 Class A serves as a base class for the derived class B, which in turn
serves as a base class for the derived class C. (Which type Of Inheritance
explain with an example)*/

// ANS: This inheritance is called  hierarchical inheritance

// EXAMPLE :
package com.innovation.geometry;


class A{
	String name= "A";

}
class B extends A{
	void show() {
		System.out.println("this is first child class");
	}
}
class C extends A{
	void show() {
		System.out.println("This is second child class which invoked parent class "+name);
	}
}
public class TESTeg { 

	public static void main(String[] args) {
		C c = new C();
		c.show();


	}

}
