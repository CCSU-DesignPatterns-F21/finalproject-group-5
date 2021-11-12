package designProject;

import java.awt.Graphics;

/**
 * Interface that other methods use to create characters.
 */
public interface Character {
	/**
	 * Creates character using g2d
	 * @param g G2d graphics used to create character in
	 */
	public void draw_character(Graphics g);
}
