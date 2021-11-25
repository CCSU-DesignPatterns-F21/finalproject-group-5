
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

/**
 * Knight() creates Knight character in game.
 */
public class Knight implements Speed, Character{
	public static int tri_X_coordinates [] = {190, 200, 190, 180};
	public static  int tri_y_coordinates_enemy [] = {110, 125, 140, 125  };
	public static  int tri_y_coordinates_player [] = {210, 225, 240, 225 };
	private int points = 4;
	
	@Override
	public void draw_character(Graphics g) {
		Graphics enemy_knight = (Graphics) g;
		
	    enemy_knight.fillPolygon(tri_X_coordinates, tri_y_coordinates_enemy, points);
	    
	    Graphics player_knight = (Graphics) g;
	    
	    player_knight.fillPolygon(tri_X_coordinates, tri_y_coordinates_player, points);
		
	}
	
	//get_velocity function will be overridden by decorator for velocity
	public int get_velocity() {
		return 1;
	}
	
	int velocity = get_velocity();
	

	//initialize velocity int to what set_speed returns since that is the velocity
	 public void changeX(int offset, int velocity) {
		 for(int i=0; i<tri_X_coordinates.length; i++)
			 tri_X_coordinates[i] += (offset*velocity);
	    }
	
	 public void changeY(int offset, int velocity) {
		 for(int i=0; i<tri_y_coordinates_player.length; i++) {
			 tri_y_coordinates_player[i] += (offset*velocity);
			 tri_y_coordinates_enemy[i] += (offset*velocity);
			 }
	    }


}
