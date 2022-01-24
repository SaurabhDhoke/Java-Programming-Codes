 import java.lang.*;
 import java.util.*;

 class Vectorr
  {
    public static void main(String Arg[])
     {
       Vector <Integer> vobj1 =  new Vector <Integer>();
       System.out.println("Size of vobj1 is : "+vobj1.size());
       System.out.println("Capacity of vobj1 is : "+vobj1.capacity());
       
       Vector <Integer> vobj2 =  new Vector <Integer>(20);
       System.out.println("Size of vobj2 is : "+vobj2.size());
       System.out.println("Capacity of vobj2 is : "+vobj2.capacity());
       
       Vector <Integer> vobj3 =  new Vector <Integer>(40,30);
       System.out.println("Size of vobj3 is : "+vobj3.size());
       System.out.println("Capacity of vobj3 is : "+vobj3.capacity());
       
       vobj1.add(11);
       vobj1.add(21);
       vobj1.add(31);
       vobj1.add(41);
       
       System.out.println("Size of vobj1 is : "+vobj1.size());
       
       vobj1.remove(2);    // 2 is index in vector
       vobj1.set(0,12);   // to update data
       
       Iterator <Integer> iobj = vobj1.iterator();
       while(iobj.hasNext())
        {
          System.out.println(iobj.next());
        }
       
       vobj1.clear();
       
     }
  }
