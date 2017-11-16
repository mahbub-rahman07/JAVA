import java.awt.*;
import javax.swing.*;
class appletlerning extends JApplet {
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Working", 25, 25);
	}
}
class Appletlern{
	public static void main(String[] args) {
	appletlerning ap = new appletlerning();
	}
}