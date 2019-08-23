import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletEx11_choicecontrol extends Applet implements ItemListener{

	
	String s;
	Choice c;
	public void init()
	{
		c = new Choice();
		c.add("C");
		c.add("C++");
		c.add("C#");
		c.add("Java");
		add(c);
		s="";
		c.addItemListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString(s,100,200);
	}
	
	public void itemStateChanged(ItemEvent i)
	{
		s=c.getSelectedItem();
		repaint();
	}
	//<applet code="AppletEx11_choicecontrol.class" height="400" width="400"></applet>
}
