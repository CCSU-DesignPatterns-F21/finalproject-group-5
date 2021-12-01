import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

class KeyboardInput extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode()== KeyEvent.VK_W) {
                            Game.changeY(-10);
                    }
                    else if (e.getKeyCode()== KeyEvent.VK_A) {
                            Game.changeX(-10);
                    }
                    else if (e.getKeyCode()== KeyEvent.VK_S) {
                            Game.changeY(10);
                    }
                    else if (e.getKeyCode()== KeyEvent.VK_D) {
                            Game.changeX(10);
                    }
                    else if (e.getKeyCode()== KeyEvent.VK_CONTROL){
                            Originator.saveState();
                    }
                    else if (e.getKeyCode()== KeyEvent.VK_DELETE) {
                            Originator.loadState();
                    }
    }
}