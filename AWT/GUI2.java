 
 import java.lang.*;
 import java.awt.*;
 
 class MarvellousWindow extends Frame
  { 
    public MarvellousWindow()
     {
       super();
     }
  }
  
 class GUI2
  {
    public static void main(String Arg[])
     {
       MarvellousWindow mobj = new MarvellousWindow();
       mobj.setSize(300,300);
       mobj.setTitle("Marvellous");   
       mobj.setVisible(true);
     }
  }
