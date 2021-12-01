package designProject;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class rock implements MapObject {
	private Graphics g;
	int numRocks;
	int min = 1;
	int max = 100;
	double xvalue = Math.random() * (max - min) + min;
	double yvalue = Math.random() * (max - min) + min;
	
	public void getg(Graphics g) {
		this.g = g;
	}
	
	public int setRocks(int numRocks) {
		return numRocks;
	}
	
	@Override
	public void draw(List <Integer> coordinate_list) {
		for(int i=0; i< coordinate_list.size()-1; i++) {
			g.setColor(new Color(128, 128, 128));
			g.fillOval(coordinate_list.get(i), (coordinate_list.get(i+1) ), 25, 30);
		}
	}
	
		
		//g2d.fillOval(x + 345, y + 245, 35, 30);
		//g2d.fillOval(x + 200, y + 50, 35, 30);
		//g2d.fillOval(x + 175, y + 35, 35, 30);
		//g2d.fillOval(x + 235, y + 100, 35, 30);
		//g2d.fillOval(x + 150, y + 225, 35, 30);
		//g2d.fillOval(x + 350, y + 150, 35, 30);
		//g2d.fillOval(x + 275, y + 295, 35, 30);
		
	}


