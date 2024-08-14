import java.awt.*;
import java.awt.event.*;

class AWT17 extends Frame{
    int x,y,flg;
    Color cr;
    AWT17()
    {
        super ("Adapter Classes");
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e)
            {
                x=e.getX();
                y=e.getY();

                cr=new Color((int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255));

                if(e.getButton()==MouseEvent.BUTTON1 )
                    flg=1;
                else    
                    flg=0;    


                draw(flg);
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
    void draw(int flg)
    {
        Graphics g=getGraphics();
        g.setColor(cr);

        if(flg==0)
            g.fillOval(x,y,20,20);
        else    
            g.fillRect(x,y,20,20);    


        //g.drawOval(x,y,20,20);
        //g.fillOval(x,y,20,20);
    }

    public static void main(String [] args)
    {
        AWT17 a=new AWT17();   
    }
}