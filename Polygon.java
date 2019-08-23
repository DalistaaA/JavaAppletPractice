import java.applet.Applet;
import java.awt.*;

public class Polygon extends Applet{

	public void paint(Graphics g)
	{
		g.setColor(new Color(255,0,0));
		/*int x[]={50,90,10};
		int y[]={10,60,60};
		int p=3;
		
		g.drawPolygon(x,y,p);*/
		
		int x[]={50,70,70,30,30};
		int y[]={10,30,60,60,30};
		int p=5;
		
		g.fillPolygon(x,y,p);
		
	}
	//<applet code="Polygon.class" height="400" width="400"></applet>
}
