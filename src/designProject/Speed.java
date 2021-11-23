package designProject;

import java.awt.Graphics;
import java.awt.Graphics2D;

public interface Speed {
	int get_velocity();
	int set_velocity(int velocity);
	void changeX(int offset);
	void changeY(int offset);
	void draw_character(Graphics g);
	

}
