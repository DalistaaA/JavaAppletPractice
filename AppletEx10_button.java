import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletEx10_button extends Applet implements ActionListener{

	Button clk,clr;
	String msg;
	public void init()
	{
		msg="";
		clk=new Button("Click");
		clr=new Button("Clear");
		add(clk);
		add(clr);
		clk.addActionListener(this);
		clr.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,100,200);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();
		if(str.equals("Click")==true)
		{
			msg="Tutor Joes";
		}
		else
		{
			msg=" ";
		}
		repaint();
	}
	//<applet code="AppletEx10_button.class" height="400" width="400"></applet>
}
