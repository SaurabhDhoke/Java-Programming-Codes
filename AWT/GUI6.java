 
 import java.lang.*;
 import java.awt.*;
 import java.awt.event.*;

 class MarvellousWindow extends Frame implements ActionListener
  { 
    public Button b1;
    public TextField t1;
    
    public MarvellousWindow(String str , int x, int y)
     {
       super();
       setTitle(str);
       setSize(x,y);
       
       b1 = new Button("Submit");
       t1 = new TextField();
       
       b1.set.Bounds(50,50,100,50);   // button
       t1.set.Bounds(50,100,100,50);  // textbox
       
       add(b1);
       add(t1);
       
       b1.addActionListener(this);
       setLayout(null);
       setVisible(true);
     }
    
    public void actionPerformed(ActionEvent obj)
     {
       t1.setText("PPA");
     }
  }
 
 class GUI5
  {
    public static void main(String Arg[])
     {
       MarvellousWindow mobj1 = new MarvellousWindow("First",500,500);
     }
  }

