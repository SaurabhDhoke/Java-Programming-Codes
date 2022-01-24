 import java.lang.*;
 import java.util.*;

 class stack
  {
    public static void main(String Arg[])
     {
       Stack <String> sobj = new Stack<String>();
       
       sobj.push("India");
       sobj.push("US");
       sobj.push("Pakistan");
       sobj.push("China");
       
       System.out.println(sobj);
       
      // sobj.pop();
      // sobj.pop();
       System.out.println(sobj);
       
       Iterator <Integer> iobj = sobj.iterator();
       while(iobj.hasNext())
        {
          System.out.println(iobj.next());
        }
       
       
       
       sobj = null; 
     }
  }
