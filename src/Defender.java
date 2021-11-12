package designProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

/**
 * Creates defender using interface character.
 */
public class Defender implements Character{
	
	private int tri_X_coordinates1 [] = {175,180,185};
	private int tri_X_coordinates2 [] = {185,190,195};
	private int tri_X_coordinates3 [] = {195,200,205};
	private int tri_y_coordinates_enemy [] = {60,70, 60};
	private int tri_y_coordinates_player [] = {300,290, 300};
	private int rect_X_coordinate_enemy = 175;
	private int rect_y_coordinate_enemy= 30;
	private int rect_X_coordinate_player = 175;
	private int rect_y_coordinate_player= 300;
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
	
	
	
	
	
	//super.paint(g);
    //Graphics2D g2d = (Graphics2D) g;
    //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
    //        RenderingHints.VALUE_ANTIALIAS_ON);
    //g2d.fillOval(x, y, 30, 30);
    //g2d.fillRect(100,100,30,30);
    //if(evilflagtaken==0)
    //    g2d.drawRect(evilflagx, evilflagy, 30, 30);
   // g2d.drawOval(400, 100, 30, 30);

}
