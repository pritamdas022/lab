// Q.2 write a java program to check whether java is installed on your computer.

public class programToCheckOrNot {

    public static void main(String[] args)
    {
      
          System.out.println("\njava version: "+System.getProperty("java.version"));
          System.out.println("java Runtime version: "+System.getProperty("java.runtime.version"));
          System.out.println("java Home: "+System.getProperty("java.home"));
          System.out.println("java vendor: "+System.getProperty("java.vendor"));
          System.out.println("java class path: "+System.getProperty("java.class.path")+"\n");
    }
 }   
          
       
           
