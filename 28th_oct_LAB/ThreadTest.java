/*Problem code 1. Create two threads to print even numbers and odd numbers from 1 to 100?
note: after printing of all even numbers only odd numbers should print*/
package LAB;
// creating first thread
class test extends Thread{
//	method
	public void run() {
		System.out.println("----------------------");
		System.out.println("Even numbers are :");
		System.out.println("----------------------");
		for (int i = 0; i<=100; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}
}
// creating second thread
class test1 extends Thread{
//	method
	public void run() {
		System.out.println("----------------------");
		System.out.println("Odd numbers are : ");
		System.out.println("----------------------");
		for (int j = 0; j <=100; j++) {
			if (j%2!=0) {
				System.out.println(j);
			}
		}
	}
}
// main class
public class ThreadTest {
// main method
	public static void main(String[] args) {
//		creating object 1
		test t = new test();
//		creating object 2
		test1 t1 = new test1();
		t.run();
		t1.start();

	}

}
