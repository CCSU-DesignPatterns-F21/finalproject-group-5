package designProject;
import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Random;

public class tree implements MapObject {
	private Graphics2D g2d;
	int min = 1;
	int max = 100;
	double xvalue = Math.random() * (max - min) + min;
	double yvalue = Math.random() * (max - min) + min;
	int x = (int)xvalue;
	int y = (int)yvalue + 45;
	public void getg2d(Graphics2D g2d) {
		this.g2d = g2d;
	}
	
	@Override
	public void draw() {
		g2d.setColor(new Color(175, 50, 0));
		g2d.fillRect(x, y, 25, 45);
		g2d.setColor(new Color(27, 152, 56));
		g2d.fillOval(x, y - 20, 25, 30);
		g2d.setColor(new Color(175, 50, 0));
		g2d.fillRect(x + 50, y, 25, 45);
		g2d.setColor(new Color(27, 152, 56));
		g2d.fillOval(x + 50, y - 20, 25, 30);	
		g2d.setColor(new Color(175, 50, 0));
		g2d.fillRect(x + 150, y + 125, 25, 45);
		g2d.setColor(new Color(27, 152, 56));
		g2d.fillOval(x + 150, y - 20 + 125, 25, 30);	
		g2d.setColor(new Color(175, 50, 0));
		g2d.fillRect(x + 90, y + 250, 25, 45);
		g2d.setColor(new Color(27, 152, 56));
		g2d.fillOval(x + 90, y - 20 + 250, 25, 30);	
		g2d.setColor(new Color(175, 50, 0));
		g2d.fillRect(x + 125, y + 75, 25, 45);
		g2d.setColor(new Color(27, 152, 56));
		g2d.fillOval(x + 125, y - 20 + 75, 25, 30);	
	}
}
