import java.awt.*;
import java.awt.event.*;

class AWT16 extends Frame{
    int x,y;
    Color cr;
    AWT16()
    {
        super ("Adapter Classes");
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e)
            {
                x=e.getX();
                y=e.getY();

                cr=new Color((int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255));
                draw();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
            setSize(500,500);
            setVisible(true);
    }
    void draw()
    {
        Graphics g=getGraphics();
        g.setColor(cr);
        //g.drawOval(x,y,20,20);
        g.fillOval(x,y,20,20);
    }

    public static void main(String [] args)
    {
        AWT16 a=new AWT16();   
    }
}