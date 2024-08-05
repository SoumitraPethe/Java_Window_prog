import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AWT5 extends Frame implements ActionListener,FocusListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	int no,mrk;
	String nm;
	AWT5()
	{
		super("Login");
		l1=new Label("Roll No");
		l2=new Label("Student Name");
		l3=new Label("Marks");
			
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		
		t1.addFocusListener(this);
		t3.addFocusListener(this);

		b1=new Button("OK");
		b2=new Button("Exit");
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(new GridLayout(4,2,5,5));
		
		add(l1);
		add(t1);
		
		add(l2);
		add(t2);
		
		add(l3);
		add(t3);
		
		add(b1);
		add(b2);
		
		setSize(400,300);
		//setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(b==b2)
			System.exit(0);
		else
		{
			String c="Roll No"+no+"\nMarks"+mrk+"\nName"+nm;
			String d=t2.getText();

			JOptionPane.showMessageDialog(null,c);
			t1.requestFocus();
		}
		
	}
	public void focusGained(FocusEvent e)
	{
	}
	public void focusLost(FocusEvent e)
	{
		TextField t=(TextField)e.getSource();
		if(t==t1)
		{
			try
			{
				no=Integer.parseInt(t1.getText());
			}
			catch(Exception e1)
			{
				t1.requestFocus();
				return;
			}
		}
		if(t==t3)
		{
			try
			{
				mrk=Integer.parseInt(t3.getText());
			}
			catch(Exception e2)
			{
				t3.requestFocus();
				return;
			}
		}
			
	}
	public static void main(String [] args)
	{
		AWT5 a=new AWT5();
	}
}