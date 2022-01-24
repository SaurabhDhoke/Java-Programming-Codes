 
 import java.lang.*;
 
 class Demo
  {
    // Overloading by changing the data type 
    
    public int Add(int no1, int no2)
     {
       System.out.println("Inside First Add");
       return no1 + no2;
     }
     
    public float Add(float no1, float no2)
     {
       System.out.println("\nInside Second Add");
       return no1 + no2;
     }
  }
 
 class Overloading 
  {
    public static void main(String Arg[])
     {
       System.out.println("Inside Main \n");
       
   //  Demo obj = new Demo(); 
       Demo obj;
       obj = new Demo();
       
       int iret = 0;
       float fret = 0.0f;
       
       iret = obj.Add(10,11);
       System.out.println("Addition of two Integers : "+iret);
       
       fret = obj.Add(10.5f,11.3f);
       System.out.println("Addition of two Floats : "+fret);
       
     }
   
  }
