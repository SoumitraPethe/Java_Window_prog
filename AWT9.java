import java.awt.*;
import java.awt.event.*;
public class AWT9 extends Frame implements WindowListener
{
	Label l1;
	AWT9()
	{
		super("Window Listner");
		l1=new Label("Message");
		l1.setBounds(50,50,200,20);
		setLayout(null);
		add(l1);
		addWindowListener(this);
		setSize(400,400);
		setVisible(true);
		
	}
	public void windowOpened(WindowEvent e)
	{
		l1.setText("Opened");
		System.out.println("Opened");

	}
	public void windowClosed(WindowEvent e)
	{
		l1.setText("Closed");
		System.out.println("Closed");
	}
	public void windowIconified(WindowEvent e)
	{
		l1.setText("Iconified");
		System.out.println("Iconified");
	}
	public void windowDeiconified(WindowEvent e)
	{
		l1.setText("Deiconified");
		System.out.println("Deiconified");
	}
	public void windowActivated(WindowEvent e)
	{
		l1.setText("Activated");
		System.out.println("Activated");
	}
	public void windowDeactivated(WindowEvent e)
	{
		l1.setText("Deactivated");
		System.out.println("Deactivated");
	}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		
	}

	public static void main(String [] args)
	{
		AWT9 a=new AWT9();
	}

}