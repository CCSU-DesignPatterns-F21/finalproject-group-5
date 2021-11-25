package designProject;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class FastSpeedDecorator extends SpeedDecorator {


	public FastSpeedDecorator(Speed decoratedSpeed){
		super(decoratedSpeed);
		//this.speed=speed;
		}
		
	@Override 
	public int get_velocity() {
		decoratedSpeed.get_velocity();
		return fast_speed(decoratedSpeed);
		}
	
	private int fast_speed(Speed decoratedSpeed){
		return decoratedSpeed.get_velocity()+5;
		}
	
	
	@Override
	public void draw_character(Graphics g) {
		decoratedSpeed.draw_character(g);
	}

	@Override
	public void changeX(int offset) {
		decoratedSpeed.changeX(offset);
	}

	@Override
	public void changeY(int offset) {
		decoratedSpeed.changeY(offset);
		
	}

	@Override
	public int set_velocity(int velocity) {
		return velocity;
	}







		
		
	
		
}
