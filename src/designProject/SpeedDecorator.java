package designProject;

import java.awt.Graphics;

public abstract class SpeedDecorator implements Speed {
	
	protected  Speed decoratedSpeed;

	public SpeedDecorator( Speed decoratedSpeed ){
		this.decoratedSpeed = decoratedSpeed;
	}
	
	@Override
	public int get_velocity() {
		return decoratedSpeed.get_velocity();
		}
	
	@Override
	public void draw_character(Graphics g) {
		decoratedSpeed.draw_character(g);
	}
	
	@Override
	public void changeX(int offset, int velocity) {
		decoratedSpeed.changeX(offset,velocity);
	}

	@Override
	public void changeY(int offset, int velocity ) {
		decoratedSpeed.changeY(offset, velocity);
		
	}
	
	

}
