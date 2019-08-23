import java.applet.Applet;
import java.awt.*;

public class AppletEx4 extends Applet{

	public void paint(Graphics g)
	{
		g.setColor(new Color(255,0,0));
		g.drawRect(20,20,80,80);
		g.fillRect(100,100,80,80);
		g.drawRoundRect(200,200,100,50,10,10);
		g.fillRoundRect(50,50,100,50,10,10);
		g.draw3DRect(300,300, 80,80, true);
		g.fill3DRect(250,250, 80,80, true);
	}
	//<applet code="AppletEx4.class" height="400" width="400"></applet>
}
