 // for close the window
 import java.lang.*;
 import java.awt.*;
 import java.awt.event.*;
 
 class MarvellousWindow extends WindowAdapter
  { 
    Frame fobj;
    
    public MarvellousWindow(String str , int x, int y)
     {
       fobj = new Frame(str);
       fobj.setSize(x,y);
       fobj.addWindowListener(this);
       fobj.setVisible(true);
       
     }
   
    public void windowClossing(WindowEvent obj)
     {
       System.exit(0);
     }
   
  }
  
 class GUI8
  {
    public static void main(String Arg[])
     {
       MarvellousWindow mobj1 = new MarvellousWindow("First",500,500);

     }
  }
