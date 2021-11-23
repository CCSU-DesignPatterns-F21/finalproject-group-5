package designProject;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*;
import java.util.Timer;
import java.awt.event.*;
import java.util.TimerTask;
import java.lang.Math;


public class Game extends JPanel {
    //character values
	SingletonFlag flag = SingletonFlag.getInstance();
	MapFactory mapfactory = new MapFactory();
	MapObject tree = mapfactory.getObject("TREE");
	MapObject rock = mapfactory.getObject("ROCK");
    private static int sizex = 30;
    private static int sizey = 30;
    private static int x =200;
    private static int y = 100;
    private static int health=100;

    private static int enemyx = 400;
    private static int enemyy = 100;
    public static int evilflagx = 500;
    public static int evilflagy = 100;

    private static int evilflagtaken = 0;

    static void changeX(int offset) {
        x += offset;
    }

    static void changeY(int offset) {
        y += offset;
    }

    static void damage(){health=health-1;}

    public static double startTime;
    public static double elapsed;

    @Override
    public void paint(Graphics g) {
        if(x==evilflagx&&y==evilflagy)
            evilflagtaken=1;
        if(x==enemyx&&y==enemyy)
            damage();
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        //g2d.fillOval(x, y, 30, 30);
        //g2d.fillRect(100,100,30,30);
        if(evilflagtaken==0)
            g2d.drawRect(evilflagx, evilflagy, 30, 30);
        g2d.drawOval(400, 100, 30, 30);
            
        Defender def = new Defender(); 
        flag.getevilx(evilflagx);
        flag.getevily(evilflagy);
        flag.getg2d(g2d);
        
        //factory
        tree.getg2d(g2d);
        rock.getg2d(g2d);
        tree.draw();
        rock.draw();


        g2d.drawRect(0,0,30,200);
        g2d.fillRect(0,0,30,health*2);
        elapsed = (System.currentTimeMillis() - startTime) / 60000;
        g2d.drawString("Time remaining: "+ String.valueOf(2-elapsed), 200, 200);

    }

    public void gameStart(ActionEvent e){

        def.draw_character(g);
        
        
        Knight knight = new Knight();
        
        knight.draw_character(g);
        
        Runner runner = new Runner();
        runner.draw_character(g);
        
    }
    
    
    

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("CTF");
        startTime= System.currentTimeMillis();
        Game game = new Game();
        
      
        //frame.add(def);
        
        frame.add(game);
        frame.setSize(400, 400);
        frame.addKeyListener((KeyListener) new KeyboardInput());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        



        while (elapsed<=3) {
            if(health==0){
                System.out.println("Character dead");
                break;
            }
            if(elapsed>2){
                System.out.print("Out of time.");
                break;
            }

            game.repaint();
            Thread.sleep(10);
        }

    }
}
