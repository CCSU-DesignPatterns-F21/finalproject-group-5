package designProject;

import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class SpeedDecorator implements Speed {
	
	protected Speed decoratedSpeed;

	public SpeedDecorator( Speed decoratedSpeed ){
		super();
		this.decoratedSpeed = decoratedSpeed;
	}

}
