import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;



public class SingletonFlag{
	public static SingletonFlag getInstance(){
		if (theInstance == null) {
			theInstance = new SingletonFlag();
		}
		return theInstance;
	}
	private SingletonFlag() {
	}
	private static SingletonFlag theInstance = null;
	private Graphics2D g2d;
	public void drawFlag() {
		g2d.drawRect(500, 100, 30, 30);
	}
}
