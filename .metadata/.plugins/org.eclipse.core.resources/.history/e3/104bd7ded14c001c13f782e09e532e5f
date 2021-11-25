package designProject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Knight implements Character, Speed{

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
	
	@Override
	public int get_velocity() {
		return 1;
	}
	
	int vel = get_velocity();
	
	@Override
	public int set_velocity(int vel) {
		return vel;
	}
	
	int velocity = set_velocity(vel);


	//initialize velocity int to what set_speed returns since that is the velocity
	
	@Override
	 public void changeX(int offset) {
		 
		 for(int i=0; i<tri_X_coordinates.length; i++)
			 tri_X_coordinates[i] += (offset*velocity);
	    }
	@Override
	 public void changeY(int offset) {
		 for(int i=0; i<tri_y_coordinates_player.length; i++) {
			 tri_y_coordinates_player[i] += (offset*velocity);
			 tri_y_coordinates_enemy[i] += (offset*velocity);
			 }
	    }

	


	

	

	










}
