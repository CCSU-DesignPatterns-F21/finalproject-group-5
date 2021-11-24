package designProject;

import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class KeyboardInput extends KeyAdapter  {
	
	Speed fastKnight = new FastSpeedDecorator((Speed) new Knight()); 
	int fastSpeed = fastKnight.get_velocity();
	
	Speed extraFastRunner = new ExtraFastSpeedDecorator((Speed) new Runner()); 
	int extraFastSpeed = extraFastRunner.get_velocity();
	
	Speed slowSpeedDefender = new SlowSpeedDecorator((Speed) new Defender());
	int slowSpeed = slowSpeedDefender.get_velocity();
	
	
	
	public void keyPressed( KeyEvent e) {
		
		
		if (e.getKeyCode()== KeyEvent.VK_W) {
			Game.changeY(-1);
			fastKnight.changeY(-1,fastSpeed);
			extraFastRunner.changeY(-1,extraFastSpeed);
			slowSpeedDefender.changeY(-1, slowSpeed);
			}
		
		else if (e.getKeyCode()== KeyEvent.VK_A) {
			Game.changeX(-1);
			fastKnight.changeX(-1,fastSpeed);
            extraFastRunner.changeX(-1,extraFastSpeed);
            slowSpeedDefender.changeX(-1, slowSpeed);
			}
		
		else if (e.getKeyCode()== KeyEvent.VK_S) {
			Game.changeY(1);
			fastKnight.changeY(1,fastSpeed);
			extraFastRunner.changeY(1,extraFastSpeed);
			slowSpeedDefender.changeY(1,slowSpeed);
			}
		
		else if (e.getKeyCode()== KeyEvent.VK_D) {
			Game.changeX(1);
			fastKnight.changeX(1,fastSpeed);
            extraFastRunner.changeX(1, extraFastSpeed);
            slowSpeedDefender.changeX(1,slowSpeed);
			}
		
		 else if (e.getKeyCode()== KeyEvent.VK_CONTROL){
             Originator.saveState();
             
		 	}
		
		 else if (e.getKeyCode()== KeyEvent.VK_DELETE) {
             Originator.loadState();
		 }
	}
	
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}

	

	
   
}


