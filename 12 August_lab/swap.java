//Q.2 swapping two variables
public class swapp {
 
    public static void main(String[] args)
    {
 //initialize the local variables
        int x = 100, y = 200;
 //Before swapping
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 //This is swapp logic
        int temp = x;
        x = y;
        y = temp;
 //After swapping
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
