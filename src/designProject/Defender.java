package designProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class Defender extends KeyboardInput implements Character{
	
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
		Graphics enemy_defender = (Graphics) g;
		
		enemy_defender.fillRect(rect_X_coordinate_enemy, rect_y_coordinate_enemy, character_width, character_length);
		enemy_defender.fillPolygon(tri_X_coordinates1, tri_y_coordinates_enemy,crown_points);
		enemy_defender.fillPolygon(tri_X_coordinates2, tri_y_coordinates_enemy,crown_points);
		enemy_defender.fillPolygon(tri_X_coordinates3, tri_y_coordinates_enemy,crown_points);
		
		Graphics player_defender = (Graphics) g;
		
		player_defender.fillRect(rect_X_coordinate_player, rect_y_coordinate_player, character_width, character_length);
		player_defender.fillPolygon(tri_X_coordinates1, tri_y_coordinates_player,crown_points);
		player_defender.fillPolygon(tri_X_coordinates2, tri_y_coordinates_player,crown_points);
		player_defender.fillPolygon(tri_X_coordinates3, tri_y_coordinates_player,crown_points);
		
		
	}
	
	static void changeX(int offset) {
		rect_X_coordinate_player +=offset;
		rect_X_coordinate_enemy +=offset;
		
		for(int i=0; i<tri_X_coordinates1.length; i++)
			tri_X_coordinates1[i] += offset;
		for(int i=0; i<tri_X_coordinates2.length; i++)
			tri_X_coordinates2[i] += offset;
		for(int i=0; i<tri_X_coordinates3.length; i++)
			tri_X_coordinates3[i] += offset;
	}
	
	 static void changeY(int offset) {
		 rect_y_coordinate_player +=offset;
		 rect_y_coordinate_enemy +=offset;
		 
		 for(int i=0; i<tri_y_coordinates_player.length; i++)
			 tri_y_coordinates_player[i] +=offset;
		 
		 for(int i=0; i<tri_y_coordinates_enemy.length; i++)
			 tri_y_coordinates_enemy[i] +=offset;
	    }

	

}
