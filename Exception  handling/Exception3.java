
import java.util.Scanner;
 class Demo
  {
    public float Divison(int x, int y) throws ArithmeticException
     {
       float ans = 0.0f;
       ans = x/y;
       return ans;     
     }
  }

 class Exception3
  {
    public static void main(String arg[])
     {
       int no1 = 0, no2 = 0;
       float result = 0.0f;
       
       Scanner sobj = new Scanner(System.in);
       Demo obj = new Demo();
       
       System.out.println("Enter First number : "); 
       no1 = sobj.nextInt();
      
       System.out.println("Enter Second number : "); 
       no2 = sobj.nextInt();
       
       try
        { 
          result = obj.Divison(no1,no2);
          System.out.println("Divison is : "+result);
        }
      
       catch(ArithmeticException obj1)
        {
          System.out.println("Exception occured ");
        }  
    }
 } 
