package designProject;

import java.awt.Graphics;
import java.awt.Color;

public class Enemy {

	public static int enemyx = 390;
	public static int enemyy = 110;
	
	public void draw_character(Graphics g) {
	    Graphics enemy = (Graphics) g;
	    enemy.setColor(Color.RED);
	    enemy.fillOval(enemyx, enemyy, 30, 30);
	}
}
