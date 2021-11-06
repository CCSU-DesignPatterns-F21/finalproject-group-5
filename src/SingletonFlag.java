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
		g2d.drawRect(evilflagx, evilflagy, 30, 30);
	}
	private static SingletonFlag theInstance = null;
	private Graphics2D g2d; 
}
