import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletEx8_checkbox extends Applet implements ItemListener{

	Checkbox c1, c2;
	String msg;
	public void init()
	{
		msg="";
		c1 = new Checkbox("Tutor", true);
		c2 = new Checkbox("Joes", true);
		add(c1);
		add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);
	}
	
	public void paint(Graphics g)
	{
		msg = "Tutor :"+c1.getState()+"  "+"Joes :"+c2.getState();
		g.drawString(msg,100,200);
	}
	
	public void itemStateChanged(ItemEvent i)
	{
		repaint();
	}
	//<applet code="AppletEx8_checkbox.class" height="400" width="400"></applet>
}
