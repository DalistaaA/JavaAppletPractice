import java.applet.*;
import java.awt.*;

public class AppletEx7 extends Applet{

	Label label;
	public void init()
	{
		label = new Label("TutorJoes");
		label.setBackground(Color.RED);
		add(label);
	}
	//<applet code="AppletEx7.class" height="400" width="400"></applet>
}
