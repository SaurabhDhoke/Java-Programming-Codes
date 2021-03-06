 
 class Demo implements Cloneable
  {
    public String Name;
    public String Batch;
    
    public Demo(String x, String y)
     {
       this.Name = x;
       this.Batch = y;
     }
    
    public String toString()
     {
       return this.Name+" "+this.Batch;
     }
    
    protected void finalize()
     {
       System.out.println("Inside Finalize methode ");
     }
    
    public Object clone() throws CloneNotSupportedException
     {
       return super.clone();
     }
  }
  
 class ObjectDemo1 
  {
    public static void main(String Arg[]) throws Exception
     {
       String s1 = "Hello";
       String s2 = "Hello";
         if(s1.equals(s2))
          {
             System.out.println("Strings are Equal...");
          }
          
       Demo obj1 = new Demo("Rahul","PPA");
       Demo obj2 = new Demo("Amit","Python");
       
       System.out.println("Hashcode of obj1 is : "+obj1.hashCode());
       System.out.println("Hashcode of obj2 is : "+obj2.hashCode());
       System.out.println(obj1.toString());
       
       Class cobj = obj1.getClass();
       System.out.println("Name of the class is : "+cobj.getName());
       
       Demo objx = (Demo)obj1.clone();
       System.out.println(objx.toString());       
       
       
       obj1 = null;
       obj2 = null;
       System.gc();
     }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
666666  
  
  
  
  
  
  
  
  
  
