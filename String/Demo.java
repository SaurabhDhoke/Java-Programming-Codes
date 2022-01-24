 
 class Demo
  {
    public static void main(String Arg[])
     {
       String str1 = "Hello";
       String str2 = new String("Hello");
       
       char Arr[] = {'H','e','l','l','o'};
       String str3 = new String(Arr);
       
       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str3);
       
       System.out.println("String length is : "+str1.length());  // length method   (.length() )
       System.out.println("Array length is : "+Arr.length); // length property (length)
       
       
       String s1 = "Demo";
       String s2 = "Demo";   // string literals
       String s3 = "Demo";
       
       String s4 = new String("Demo");
       String s5 = new String("Demo");   // string objects
       String s6 = new String("Demo");
                            
       System.out.println(s6.charAt(0));   // D
       System.out.println(s6.charAt(3)) ;  // o    
       
       for(int j =0 ; j < s6.length() ; j++)
        {
          System.out.println(s6.charAt(j));
        }
       
       
       char Brr[] = s6.toCharArray();
       for(int i = 0 ; i<Brr.length; i++)
        {
          System.out.println(Brr[i]);
        }
       
       String sobj1 = "Hello";
       String sobj2 = "Hello";   
       String sobj3 = new String("Hello"); 
        
       if(sobj1 == sobj3) 
        {
          System.out.println("Equal");
        }
       else
        {
          System.out.println("Non Equal");
        }
        
       if(sobj1.equals(sobj3))
        {
          System.out.println("Equal");
        }
       else
        {
          System.out.println("Non Equal");
        }
       
        
      }
  }
  
  
  
  
