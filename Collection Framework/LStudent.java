 import java.lang.*;
 import java.util.*;
 
 class Students
  {
    public String Name;
    public int RID;
    public int Age;
    
    public Students(String a , int b , int c)
     {
       this.Name = a;
       this.RID = b;
       this.Age = c;     
     }
    
    public void Display()
     {
       System.out.println("Student Name : "+ this.Name +"RID : "+ this.RID +"Age : "+this.Age);
     }
  }
  
 class LStudent 
  {
    public static void main(String Arg[])
     {
       LinkedList <Students> lobj = new LinkedList<Students>();     
       lobj.add(new Students("Amit",121,21));
       lobj.add(new Students("Sagar",221,25));
       lobj.add(new Students("Pooja",251,26));
       
       Students ref = null;
       
       Iterator <Students> iobj = lobj.iterator();
        while(iobj.hasNext())
         {
           ref = iobj.next();
           ref.Display();
         }
       
       iobj = null;
       lobj = null;
       ref = null;
     }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
