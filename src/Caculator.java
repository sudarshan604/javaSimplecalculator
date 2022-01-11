/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sudarshan
 */
   import java.awt.event.*;
   import java.awt.*;
    class MyFrame extends Frame implements ActionListener
    {
       
         Button b1,b2,b3,b4,equal,b[]=new Button[10];
         TextField t;
      int x,y;
int c=0,w,z=1;
      Panel p;
         public MyFrame()
       {
          p = new Panel(new GridLayout(4,4,10,20));
           t= new TextField(20);
           t.setBounds(0,0,200,200);  
           for(int i=0;i<b.length;i++)
         {
             b[i]=new Button(""+i);
           p.add(b[i]); 
         }
          b1= new Button("+");
          b2= new Button("-");
          b3= new Button("/");
          b4= new Button("clear");
                   equal= new Button("=");
           p.add(equal);
          p.add(b1);
         p.add(b2);
         p.add(b3);
          p.add(b4);

 
         add(p,BorderLayout.CENTER);
        add(t,BorderLayout.NORTH); 
        setVisible(true);
        setSize(400,500);
        t.setBounds(0,0,200,200);  
           for(int i=0;i<b.length;i++)
         {
             b[i].addActionListener(this);
          
         }

                        b1.addActionListener(this);
                         b2.addActionListener(this);
                        b3.addActionListener(this);
                        equal.addActionListener(this);
             b4.addActionListener(this);
 
   addWindowListener(new WindowAdapter(){
   
    public void windowClosing(WindowEvent e)
           {
           
         System.exit(0);     
           }
   
   
   });
           }       

    @Override
    public void actionPerformed(ActionEvent ae) {
String s = null,s2 = null;


Object source = ae.getSource();
         
    
        for(int i=0;i<b.length;i++)
        {
            
            
            if(source==b[i]&&z==1)
            {
                s=b[i].getLabel();
                x=i;          
                t.setText(s);
              z=-1;
            }
          else
            {
               
            if(source==b[i]&&z==-1)
            {
                s2=b[i].getLabel();
                t.setText(s2);
               y=i;
                z=1;
            }
            
            }
       }
    
     if(source==b1)
     {
        t.setText("+");
         c=1;
     }
       
     
     if(source==b2)
     {
     
   
       t.setText("-");
       c=2;       
     }
    if(source==b3)
     {
     
   
       t.setText("/");
         c=3;

     }
       if(source==b4)
     {
     
   
       t.setText(" ");
        

     }
     
     if(source==equal)
     {
     if(c==1)
     {
       w=x+y;
       t.setText(String.valueOf(w));
     }
       if(c==2)
     {
       w=x-y;
       t.setText(String.valueOf(w));
     }   
     
        if(c==3)
     {
       w=(int)x/y;
       t.setText(String.valueOf(w));
     }
       
     }
    
    }
    
   
    }
    
    
   
   

 public class Caculator {
     public static void main(String[] args) {
         new MyFrame();
     }
}
