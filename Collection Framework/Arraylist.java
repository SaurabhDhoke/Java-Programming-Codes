 import java.lang.*;
 import java.util.*;

 class Arraylist
  {
    public static void main(String Arg[])
     {
       ArrayList <Integer> obj = new ArrayList<Integer>();
       
       obj.add(10);
       obj.add(20);
       obj.add(30);
     
       System.out.println("Data from Linked list ");
       System.out.println(obj);
    //   obj.remove(2);     to remove element
       obj.add(1,55);
        
       Iterator <Integer> iobj = obj.iterator();
       System.out.println("Data from Array list using iterator");
     
       while(iobj.hasNext())
        {
          System.out.println(iobj.next());
        }
       
       obj = null; 
     }
  }
