//Q.5 write a java program to print the sum(addition),multiply,subtract,divide and remainder of two numbers.
public class arithmetic {

    public static void main(String[] args)
    {
    // define the local variavles
           int firstnum = 125;
           int secondnum = 24;
    // calculate the arithmetical operation 
           int sum = firstnum + secondnum;
           int sub = firstnum - secondnum;
           int div = firstnum / secondnum;
           int mul = firstnum * secondnum;
           int remain = firstnum % secondnum;
    // print the output
           System.out.println(" The sum of two numbers is :"+sum);
           System.out.println(" The subtract of two numbers is :"+sub);
           System.out.println(" The division of two numbers is :"+div);
           System.out.println(" The multiplication of two numbers is :"+mul);
           System.out.println("The remainder of two numbers is :"+remain);
     }
}
