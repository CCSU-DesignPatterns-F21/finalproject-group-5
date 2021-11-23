package designProject;

import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class KeyboardInput extends KeyAdapter {
	
	//Speed s1 = new FastSpeedDecorator((Speed) new Knight()); 
	
	Knight knight = new Knight();
	
	public void keyPressed( KeyEvent e) {
		
		
		if (e.getKeyCode()== KeyEvent.VK_W) {
            knight.changeY(-1);
			//Defender.change_Y(-1);
			//Runner.change_Y(-1);
			}
		
		if (e.getKeyCode()== KeyEvent.VK_A) {
            knight.changeX(-1);
            //Defender.change_X(-1);
            //Runner.change_X(-1);
			}
		
		if (e.getKeyCode()== KeyEvent.VK_S) {
            knight.changeY(1);
			//Defender.change_Y(1);
			//Runner.change_Y(1);
			}
		
		if (e.getKeyCode()== KeyEvent.VK_D) {
            knight.changeX(1);
            //Defender.change_X(1);
            //Runner.changeX_(1);
			}
	}
	
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}

	

	
   
}


