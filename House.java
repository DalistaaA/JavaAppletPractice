import java.applet.Applet;
import java.awt.Graphics;

public class House extends Applet{

	public void paint(Graphics g)
	{
		g.drawLine(0,80,40,0);
		g.drawLine(40,0,80,80);
		g.drawRect(0,80,80,80);
	}
	//<applet code="House.class" height="400" width="400"></applet>
}
