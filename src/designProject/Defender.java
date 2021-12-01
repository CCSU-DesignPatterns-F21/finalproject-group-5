package designProject;

import java.awt.Color;
import java.awt.Graphics;

public class Defender implements Speed, Character{
	
	private static int tri_X_coordinates1 [] = {175,180,185};
	private static int tri_X_coordinates2 [] = {185,190,195};
	private static int tri_X_coordinates3 [] = {195,200,205};
	private static int tri_y_coordinates_enemy [] = {60,70, 60};
	private static int tri_y_coordinates_player [] = {300,290, 300};
	private static int rect_X_coordinate_enemy = 175;
	private static int rect_y_coordinate_enemy= 30;
	private static int rect_X_coordinate_player = 175;
	private static int rect_y_coordinate_player= 300;
	private int character_width =30;
	private int character_length= 30;
	private int crown_points =3;
	

	@Override
	public void draw_character(Graphics g) {
		/*Graphics enemy_defender = (Graphics) g;
		
		enemy_defender.fillRect(rect_X_coordinate_enemy, rect_y_coordinate_enemy, character_width, character_length);
		enemy_defender.fillPolygon(tri_X_coordinates1, tri_y_coordinates_enemy,crown_points);
		enemy_defender.fillPolygon(tri_X_coordinates2, tri_y_coordinates_enemy,crown_points);
		enemy_defender.fillPolygon(tri_X_coordinates3, tri_y_coordinates_enemy,crown_points);
		*/
		
		Graphics player_defender = (Graphics) g;
		
	
		//crown base
		g.setColor(Color.ORANGE);
		
		//crown point
		player_defender.fillRect(rect_X_coordinate_player, rect_y_coordinate_player, character_width, character_length);
		g.setColor(Color.ORANGE);
		player_defender.fillPolygon(tri_X_coordinates1, tri_y_coordinates_player,crown_points);
		g.setColor(Color.ORANGE);
		player_defender.fillPolygon(tri_X_coordinates2, tri_y_coordinates_player,crown_points);
		g.setColor(Color.ORANGE);
		player_defender.fillPolygon(tri_X_coordinates3, tri_y_coordinates_player,crown_points);
		
		//crown jewels
		g.setColor(Color.red);
		player_defender.fillOval(rect_X_coordinate_player+3, rect_y_coordinate_player-11, 4, 5);
		
		g.setColor(Color.black);
		player_defender.fillOval(rect_X_coordinate_player+13, rect_y_coordinate_player-11, 4, 5);
		
		g.setColor(Color.blue);
		player_defender.fillOval(rect_X_coordinate_player+23, rect_y_coordinate_player-11, 4, 5);
		
	}
	
	@Override
	public int get_velocity() {
		return 1;
	}
	
	int velocity= get_velocity();
	
	public void changeX(int offset, int velocity) {
		
		
		rect_X_coordinate_player +=(offset*velocity);
		rect_X_coordinate_enemy +=(offset*velocity);
		
		
		for(int i=0; i<tri_X_coordinates1.length; i++)
			tri_X_coordinates1[i] += (offset*velocity);
		for(int i=0; i<tri_X_coordinates2.length; i++)
			tri_X_coordinates2[i] += (offset*velocity);
		for(int i=0; i<tri_X_coordinates3.length; i++)
			tri_X_coordinates3[i] += (offset*velocity);
	}
	
	 public void changeY(int offset, int velocity) {
		 
		 
		 if(rect_y_coordinate_player>200) {
			 rect_y_coordinate_player +=(offset*velocity);
			 tri_y_coordinates_player[0] +=(offset*velocity);
			 tri_y_coordinates_player[1] +=(offset*velocity);
			 tri_y_coordinates_player[2] +=(offset*velocity);
		 }
		 
		 else {
			 rect_y_coordinate_player +=(-offset*10);
			 tri_y_coordinates_player[0] +=(-offset*10);
			 tri_y_coordinates_player[1] +=(-offset*10);
			 tri_y_coordinates_player[2] +=(-offset*10);
		 }
		 
		 /*
		 for(int i=0; i<tri_y_coordinates_player.length; i++) {
			 if(rect_y_coordinate_player>200) {
				 
				 tri_y_coordinates_player[i] +=(offset*velocity);
			 }
			 else {
				 //System.out.println(tri_y_coordinates_player[i]);
				 tri_y_coordinates_player[i] +=(-offset*velocity);
			 }

	    }
	    */

	
	 }
	

}
