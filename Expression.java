//Q.4 write a java program to compute the specified expressions and print the output.
// specified Expression : (25.5*3.5-3.5*3.5)/(40.5-4.5).
public class Expression {

   public static void main(String[] args) 
   {
            // declare the specified expressions value.
            float a = 25.5F, b = 3.5F, c = 3.5F, d = 3.5F;
            float e = 40.5F, f = 4.5F;
            // specified expression calculate.
            float result =(a*b-c*d)/(e-f);
            // output the specified expression.
            System.out.println("specified Expression result is :" +result);
   }
}
