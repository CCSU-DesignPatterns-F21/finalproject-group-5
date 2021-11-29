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
	
	Speed extraFastRunner = new ExtraFastSpeedDecorator((Speed) new Runner()); 
	int extraFastSpeed = extraFastRunner.get_velocity();
	
	Speed slowSpeedDefender = new SlowSpeedDecorator((Speed) new Defender());
	int slowSpeed = slowSpeedDefender.get_velocity();
	
	
	//Object decorator_arr[][] = {{fastKnight,  fastSpeed},{extraFastRunner, extraFastSpeed}, {slowSpeedDefender, slowSpeed}};
	
	Map<Speed, Integer> character_map = Map.of(fastKnight, fastSpeed, extraFastRunner, extraFastSpeed, slowSpeedDefender, slowSpeed);
		
	public boolean toggled(KeyEvent e) {
		boolean pressed = false;
		if(e.getKeyCode() == KeyEvent.VK_Q) {
			pressed = true;
		}
		return pressed;
	}

	
	public void keyPressed( KeyEvent e) {
		
		//Knight is default
		Iterator<Entry<Speed, Integer>> map_iter = character_map.entrySet().iterator();

		Map.Entry<Speed,Integer> kv = map_iter.next();	
		
		Speed key = kv.getKey();
		Integer value = kv.getValue();
		System.out.println(key);
		System.out.println(value);
		
		
		if (toggled(e) == true) {
			key = map_iter.next().getKey();
			value = map_iter.next().getValue();
			System.out.println("entered");
			System.out.println(key);
			System.out.println(value);
		}
	
		
		//Speed key3 = map_iter.next().getKey();
		//Integer value3 = map_iter.next().getValue();
		//System.out.println(key3);
		//System.out.println(value3);
		
		
		else if (e.getKeyCode()== KeyEvent.VK_W) {
			Game.changeY(-1);
			key.changeY(-1, value);
			}
			
		else if (e.getKeyCode()== KeyEvent.VK_A) {
			Game.changeX(-1);
			key.changeX(-1,value);						
			}
				
		else if (e.getKeyCode()== KeyEvent.VK_S) {
			Game.changeY(1);
			key.changeY(1,value);
			}
				
		else if (e.getKeyCode()== KeyEvent.VK_D) {
			Game.changeX(1);
			key.changeX(1,value);
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


