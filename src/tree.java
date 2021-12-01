package designProject;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class tree implements MapObject {
	private Graphics g;
	int numTrees =5;
	int min = 1;
	int max =100;
	double xvalue = Math.random() * (max - min) + min;
	double yvalue = Math.random() * (max - min) + min;
	
	int x;
	int y;
	public void getg(Graphics g) {
		this.g = g;
	}
	
	public int setTrees(int numTrees) {
		return numTrees;
	}
	
	@Override
	public void draw(List <Integer> coordinate_list) {
		for(int i=0; i< coordinate_list.size()-1; i++) {
			g.setColor(Color.BLACK);
			g.fillRect(coordinate_list.get(i), coordinate_list.get(i+1), 25, 45);
			g.setColor(Color.DARK_GRAY);
			g.fillOval(coordinate_list.get(i), (coordinate_list.get(i+1) - 20), 25, 30);
		
		}
	
	}

}

