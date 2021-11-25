import java.awt.Graphics2D;
/**
 * Interface used by other classes to create a map.
 */
public interface MapObject {
	/**
	 * Gets g2d instance
	 * @param g2d G2D that this method draws map on
	 */
	void getg2d(Graphics2D g2d);
	/** Draws maps */
	void draw();
}