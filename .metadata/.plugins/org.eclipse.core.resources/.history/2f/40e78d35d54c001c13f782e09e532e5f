package designProject;

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
	private int evilx, evily;
	private Graphics2D g2d;
	public void getevilx(int evilx) {
		this.evilx = evilx;
	}
	public void getevily(int evily) {
		this.evily = evily;
	}
	public void getg2d(Graphics2D g2d) {
		this.g2d = g2d;
	}
	public void drawFlag() {
		g2d.drawRect(evilx, evily, 30, 30);
	}
}