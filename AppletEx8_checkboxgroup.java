import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletEx8_checkboxgroup extends Applet implements ItemListener{

	CheckboxGroup cg;
	Checkbox c1,c2;
	String msg;
	public void init()
	{
		msg="";
		cg = new CheckboxGroup();
		c1 = new Checkbox("Male",cg, true);
		c2 = new Checkbox("Female",cg, false);
		add(c1);
		add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);
	}
	
	public void paint(Graphics g)
	{
		msg = cg.getSelectedCheckbox().getLabel();
		g.drawString(msg,100,200);
	}
	
	public void itemStateChanged(ItemEvent i)
	{
		repaint();
	}
	//<applet code="AppletEx8_checkboxgroup.class" height="400" width="400"></applet>
}
