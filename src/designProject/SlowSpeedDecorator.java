package designProject;

import java.awt.Graphics;

public class SlowSpeedDecorator extends SpeedDecorator {
	
	public SlowSpeedDecorator(Speed decoratedSpeed){
		super(decoratedSpeed);
		}
		
	@Override 
	public int get_velocity() {
		return decoratedSpeed.get_velocity() * 2;
		}
	
	@Override
	public void draw_character(Graphics g) {
		decoratedSpeed.draw_character(g);
	}

	@Override
	public void changeX(int offset, int velocity) {
		decoratedSpeed.changeX(offset, velocity);
	}

	@Override
	public void changeY(int offset, int velocity) {
		decoratedSpeed.changeY(offset, velocity);
		
	}

}
