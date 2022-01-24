
 class Final
  {
    public static void main(String Arr[])
     {
       Base bobj = new Derived();  // upcasting 
       bobj.fun();
       Final.gun();
     }  
    
    public static void gun()
     {
       final int no = 11;
       System.out.println("Static Fun");
   //  no++;     //  Error
     }
  }
 
 class Base
  {
    public void fun()
     {
       System.out.println("Base Fun");
     }
    public final void gun()           /// method that we cant override
     {
       System.out.println("Base gun");
     }  
  }
  
 class Derived extends Base
  {
    public void fun()        //  override
     {
       System.out.println("Derived Fun");
     }
   /* public final void gun()
     {
       System.out.println("Derived gun");
     }
  */
  }
