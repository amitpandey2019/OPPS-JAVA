import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Test extends Applet implements KeyListener
{
    String msg ="";
    public void init(){
        addKeyListener(this);
    }
    public void KeyPressed(KeyEvent k)
    { showStatus("KeyPressed");}
        public void keyRealeased(KeyEvent keyTyped)
        {showStatus("KeyRealesed");}
        public void keyTyped(KeyEvent k)
        {msg = msg+k.getKeyChar();repaint();}
        public void paint(Graphics g)
        {g.drawString(msg,20,40);}
}
