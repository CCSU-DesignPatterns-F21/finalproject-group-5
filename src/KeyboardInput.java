package designProject;

import java.awt.Graphics;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class KeyboardInput extends KeyAdapter implements KeyListener {
	
	Speed fastKnight = new FastSpeedDecorator((Speed) new Knight()); 
	int fastSpeed = fastKnight.get_velocity();
	
	//Speed extraFastRunner = new ExtraFastSpeedDecorator((Speed) new Runner()); 
	//int extraFastSpeed = extraFastRunner.get_velocity();
	
	Speed slowSpeedDefender = new SlowSpeedDecorator((Speed) new Defender());
	int slowSpeed = slowSpeedDefender.get_velocity();
	
	
	//Object decorator_arr[][] = {{fastKnight,  fastSpeed},{extraFastRunner, extraFastSpeed}, {slowSpeedDefender, slowSpeed}};
	
	//Map<Speed, Integer> character_map = Map.of(fastKnight, fastSpeed, extraFastRunner, extraFastSpeed, slowSpeedDefender, slowSpeed);
		
	public boolean toggled(KeyEvent e) {
		boolean pressed = false;
		if(e.getKeyCode() == KeyEvent.VK_Q) {
			pressed = true;
		}
		return pressed;
	}

	
	public void keyPressed( KeyEvent e) {
		
	
		//Defender
		if ((e.getKeyCode()== KeyEvent.VK_W)) {
			//Game.changeY(-1);
			slowSpeedDefender.changeY(-1, slowSpeed);
			}
			
		else if (e.getKeyCode()== KeyEvent.VK_A) {
			//Game.changeX(-1);
			slowSpeedDefender.changeX(-1,slowSpeed);						
			}
				
		else if (e.getKeyCode()== KeyEvent.VK_S) {
			//Game.changeY(1);
			slowSpeedDefender.changeY(1,slowSpeed);
			}
				
		else if (e.getKeyCode()== KeyEvent.VK_D) {
			//Game.changeX(1);
			slowSpeedDefender.changeX(1,slowSpeed);
			}
		
		//Knight
		else if (e.getKeyCode()== KeyEvent.VK_UP) {
			//Game.changeY(-1);
			fastKnight.changeY(-1, fastSpeed);
			}
			
		else if (e.getKeyCode()== KeyEvent.VK_LEFT) {
			//Game.changeX(-1);
			fastKnight.changeX(-1,fastSpeed);						
			}
				
		else if (e.getKeyCode()== KeyEvent.VK_DOWN) {
			//Game.changeY(1);
			fastKnight.changeY(1,fastSpeed);
			}
				
		else if (e.getKeyCode()== KeyEvent.VK_RIGHT) {
			//Game.changeX(1);
			fastKnight.changeX(1,fastSpeed);
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


