package designProject;

import java.awt.Graphics;

public class Runner extends KeyboardInput implements Character{
	
	private static int X_coordinate= 250;
	private static int y_coordinate_enemy= 120;
	private static int y_coordinate_player= 220;
	private int height = 15;
	private int width=8;
	
	

	@Override
	public void draw_character(Graphics g) {
		
		Graphics EnemyRunner = (Graphics) g;
		EnemyRunner.fillOval(X_coordinate, y_coordinate_enemy, width, height);
		
		Graphics PlayerRunner = (Graphics) g;
		PlayerRunner.fillOval(X_coordinate, y_coordinate_player, width, height);
	}
	
	public static void changeX(int offset) {
		X_coordinate +=offset;
	    }
	 
	 public static void changeY(int offset) {
		 y_coordinate_enemy +=offset;
		 y_coordinate_player +=offset;
	    }

	

}
