 import java.lang.*;
 import java.util.*;

 class HashTable
  {
    public static void main(String Arg[])
     {
       //          key     value
       Hashtable <String,Integer> hobj = new Hashtable <String,Integer>();
       hobj.put("PPA",15000);
       hobj.put("LB",14000);
       hobj.put("PML",15200);
       hobj.put("LSPUI",51000);
       hobj.put("Angular",21000);
       hobj.put("C#",32000);
       
       System.out.println(hobj.get("LB")); // data search with the key
       System.out.println("Size of hashtable is : "+hobj.size());
        
       System.out.println("Data From hashtable : ");
       Enumeration eobj = hobj.keys();
       hobj.remove("C#");   // to remove record
              
       while(eobj.hasMoreElements())
        {
          System.out.println(eobj.nextElement());
        }
       
       hobj.clear();  // to remove all data
       hobj = null;
     }
  }
