package designProject;

import java.awt.Graphics2D;


/**
 * Creates singleton flag.
 */
public class SingletonFlag{
	/**
	 * Gets instance of singletonflag
	 * @return Returns instance of singleton or creates if it does not exist.
	 */
	public static SingletonFlag getInstance(){
		if (theInstance == null) {
			theInstance = new SingletonFlag();
		}
		return theInstance;
	}
	private SingletonFlag() {
	}
	private static SingletonFlag theInstance = null;
	// X coordinate of flag
	private int evilx;
	// Y coordinate of flag
	private int evily;
	private Graphics2D g2d;

	/**
	 * Gets evilx variable
	 * @param evilx X coordinate of flag
	 */
	public void getevilx(int evilx) {
		this.evilx = evilx;
	}

	/**
	 * Gets evily variable
	 * @param evily Y coordinate of flag
	 */
	public void getevily(int evily) {
		this.evily = evily;
	}

	/**
	 * Gets graphics.
	 * @param g2d G2D graphics for game
	 */
	public void getg2d(Graphics2D g2d) {
		this.g2d = g2d;
	}

	/**
	 * Draws flag
	 */
	public void drawFlag() {
		g2d.drawRect(evilx, evily, 30, 30);
	}
}
