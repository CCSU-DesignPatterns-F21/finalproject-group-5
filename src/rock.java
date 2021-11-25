import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Random;

/**
 * Creates rock.
 */
public class rock implements MapObject {
	private Graphics2D g2d;
	int min = 1;
	int max = 100;
	double xvalue = Math.random() * (max - min) + min;
	double yvalue = Math.random() * (max - min) + min;
	int x = (int)xvalue;
	int y = (int)yvalue + 50;
	public void getg2d(Graphics2D g2d) {
		this.g2d = g2d;

	}
	
	@Override
	public void draw() {
		//int x = (int)Math.random() * (max - min) + min;
		//int y = (int)Math.random() * (max - min) + min;
		g2d.setColor(new Color(128, 128, 128));
		g2d.fillOval(x + 80, y + 90, 35, 30);
		g2d.fillOval(x + 345, y + 245, 35, 30);
		g2d.fillOval(x + 200, y + 50, 35, 30);
		g2d.fillOval(x + 175, y + 35, 35, 30);
		g2d.fillOval(x + 235, y + 100, 35, 30);
		g2d.fillOval(x + 150, y + 225, 35, 30);
		g2d.fillOval(x + 350, y + 150, 35, 30);
		g2d.fillOval(x + 275, y + 295, 35, 30);
	}
}

