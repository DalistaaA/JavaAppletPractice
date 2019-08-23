import java.applet.Applet;
import java.awt.*;

public class Oval extends Applet{

	public void paint(Graphics g)
	{
		g.setColor(new Color(255,0,0));
		g.drawOval(20,20,100,50);
		g.fillOval(100,100,80,80);
		
	}
	//<applet code="Oval.class" height="400" width="400"></applet>
}
