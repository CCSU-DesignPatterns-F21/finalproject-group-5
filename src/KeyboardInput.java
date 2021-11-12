package designProject;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class KeyboardInput extends KeyAdapter {
    public void keyPressed(KeyEvent e)
            {
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
            }
}