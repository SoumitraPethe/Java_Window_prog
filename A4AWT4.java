// use of text field....

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class A4AWT4 extends Frame implements ActionListener  {

    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;
    

    A4AWT4()
    {
        super ("Login..");
        l1=new Label("Roll No.");
        l2=new Label("Name.");
    
        t1=new TextField(10);
        t2=new TextField(10);

        b1=new Button("OK");
        b2=new Button("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(new GridLayout(3,2,5,5));
        add(l1);
        add(t1);
        add(l2);
        add(t2);         //all this have to add in horizontal manner....
        add(b1);
        add(b2);

        setSize(400,300);
        setResizable(false);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if(b==b2)
            System.exit(0);
        else    
            {
                String c=t1.getText();
                String d=t2.getText();
               
                JOptionPane.showMessageDialog(null, "Roll No:"+c+"\nName:"+d);
            }    
    }
    public static void main(String [] args)
    {
        A4AWT4 a=new A4AWT4();
    }
    
}
