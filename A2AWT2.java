import java.awt.*;
import java.awt.event.*;
public class A2AWT2 extends Frame implements ActionListener
{
    Button b1,b2;
    A2AWT2()
    {
        super("Use of Button..");
        b1=new Button("OK");
        b2=new Button("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);
       //           column rows     width   height
        b1.setBounds(50,100,100,20);
        b2.setBounds(170,100,100,20);

        add(b1);
        add(b2);

        setSize(320,220);
        setResizable(false);  //cant change size..
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        Button b=(Button)e.getSource();
        if (b == b2)
            System.exit(0);
        else
            System.out.println("Ok Button Pressed..");    
    }
    public static void main(String[] args) {
        A2AWT2 a= new A2AWT2(); 
    }
}