import java.awt.Graphics;

/**
 * Creates runner.
 */
public class Runner implements Speed, Character{
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
	
	@Override
	public int get_velocity() {
		return 1;
	}
	
	int velocity = get_velocity();
	
	public  void changeX(int offset, int velocity) {
		X_coordinate +=(offset*velocity);
	    }
	 
	 public  void changeY(int offset, int velocity) {
		 y_coordinate_enemy +=(offset*velocity);
		 y_coordinate_player +=(offset*velocity);
	    }

	

	

}
