package designProject;
import java.awt.Graphics;

/**
 * Knight() creates Knight character in game.
 */
public class Knight implements Character{
	
	private int tri_X_coordinates [] = {150, 160, 150, 140};
	
	private int tri_y_coordinates_enemy [] = {110, 125, 140, 125  };
	private int tri_y_coordinates_player [] = {210, 225, 240, 225 };
	
	private int points = 4;
	
	
	@Override
	public void draw_character(Graphics g) {
		Graphics enemy_knight = (Graphics) g;
		
	    enemy_knight.fillPolygon(tri_X_coordinates, tri_y_coordinates_enemy, points);
	    
	    Graphics player_knight = (Graphics) g;
	    
	    player_knight.fillPolygon(tri_X_coordinates, tri_y_coordinates_player, points);
		
	}
	
	
	

}
