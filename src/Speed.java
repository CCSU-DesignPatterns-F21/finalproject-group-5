package designProject;

import java.awt.Graphics;
import java.awt.Graphics2D;

public interface Speed {
	int get_velocity();
	void changeX(int offset, int velocity);
	void changeY(int offset, int velocity);
	void draw_character(Graphics g);

}
