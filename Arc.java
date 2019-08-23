import java.applet.Applet;
import java.awt.*;

public class Arc extends Applet{

	public void paint(Graphics g)
	{
		g.setColor(new Color(255,0,0));
		g.drawArc(20,20,100,100,0,90);
		g.drawArc(40,40,100,100,0,45);
		g.drawArc(60,60,100,100,0,60);
		g.drawArc(80,80,100,100,0,180);
		g.fillArc(100,100,100,100,0,180);
		
	}
	//<applet code="Arc.class" height="400" width="400"></applet>
}
