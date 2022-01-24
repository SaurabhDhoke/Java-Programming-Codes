
import java.util.Scanner;
 class Exception2
  {
    public static void main(String arg[])
     {
       int no1 = 0, no2 = 0;
       float result = 0.0f;
       
       Scanner sobj = new Scanner(System.in);
      
       System.out.println("Enter First number : "); 
       no1 = sobj.nextInt();
      
       System.out.println("Enter Second number : "); 
       no2 = sobj.nextInt();
       
       try
        { 
          result = no1 / no2;
          System.out.println("Divison is  : "+result);
        }
      
       catch(ArithmeticException obj)
        {
          System.out.println("Arithmetic Exception occured ");
        }
       
       catch(ArrayIndexOutOfBoundsException obj)
        {
          System.out.println("Array index Exception occured "+obj);       
        } 
      
       catch(Exception obj)      // generic catch block 
        {
          System.out.println("Exception occured "+obj);       
        } 
      
       finally
        {
          System.out.println("Inside Finally");       
        }
    }
 } 
