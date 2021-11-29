import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.*;

/**
 * Main class used to create game.
 */
public class Game extends JPanel {
    private static final Graphics2D Graphics = null;
	/** Creates instance of flag */
	SingletonFlag flag = SingletonFlag.getInstance();
    /** Creates mapfactory instance for map */
    MapFactory mapfactory = new MapFactory(); //Creates mapfactory instance for map
	/** Creates tree */
    MapObject tree = mapfactory.getObject("TREE");
    /** Creates rock */
	MapObject rock = mapfactory.getObject("ROCK"); //Creates rock
    private static int x =200; //Start x position of character
    private static int y = 100; //Start y position of character
    /** Health of player */
    private static int health=100;

    private static int enemyx = 400;
    private static int enemyy = 100;
    /** Start x position of enemy flag */
    public static int evilflagx = 500;
    /** Start y position of enemy flag */
    public static int evilflagy = 100;

    private static int evilflagtaken = 0;

    static void changeX(int offset) {
        x += offset;
    }

    static void changeY(int offset) {
        y += offset;
    }

    static void damage(){health=health-1;}
    /** Start time of game. */
    public static double startTime;
    /** Time elapsed by game, changed by paint(Graphics g) */
    public static double elapsed;
    /** Time snapshot by momento, subtracted from elapsed to go back in time*/
    public static double timeParadox;
    /** Flags collected by player */
    public static int flagsCollected=0;

    /**
     * Gets all data for momento to use
     * @return An arraylist of the data for momento
     */
    static ArrayList<Integer> getData(){
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(x);
        data.add(y);
        data.add(health);
        data.add(enemyx);
        data.add(enemyy);
        data.add(evilflagtaken);
        data.add(flagsCollected);
        return data;
    }

    /**
     * Sets data using arraylist of int data.
     * @param data Previous state of game to be loaded
     * @param timeelapsed Time at time of previous state
     */
    public static void setData(ArrayList<Integer> data, Double timeelapsed){
        x=data.get(0);
        y=data.get(1);
        health=data.get(2);
        enemyx=data.get(3);
        enemyy=data.get(4);
        evilflagtaken=data.get(5);
        flagsCollected=data.get(6);
        timeParadox=timeelapsed;
    }

    @Override
    public void paint(Graphics g) {
        if(x==evilflagx&&y==evilflagy) {
            evilflagtaken = 1;
            flagsCollected++;
        }
        if(x==enemyx&&y==enemyy)
            damage();
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
        //g2d.fillRect(100,100,30,30);
        if(evilflagtaken==0)
            g2d.drawRect(evilflagx, evilflagy, 30, 30);
        //g2d.drawOval(400, 100, 30, 30);

        Runner runner = new Runner(); 
        runner.draw_character(g);
        
        Knight knight = new Knight();
        knight.draw_character(g);
        
        Defender defender = new Defender();
        defender.draw_character(g);
        

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
        elapsed = (System.currentTimeMillis() - startTime) / 60000 -timeParadox;
        g2d.drawString("Time remaining: "+ String.valueOf(2-elapsed), 200, 200);
        //System.out.println("Elapsed:"+elapsed+"startTime:"+startTime+"currenttime:"+System.currentTimeMillis());
    }

    /**
     * Creates defender, knight, and runner.
     * @param e ActionEvent that is given to gameStart
     * @param def Defender instance
     * @param g G2D that this method draws characters on
     */
    public void gameStart(ActionEvent e,Defender def,Graphics g){

    	
        
        
        //Knight knight = new Knight();
        //knight.draw_character(g);
        
        //Runner runner = new Runner();
        //runner.draw_character(g);

    }

    /**
     * Main runner method that runs whole game
     * @param args Arguments given to program
     * @throws InterruptedException If closed stop program
     */
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("CTF");
        startTime= System.currentTimeMillis();
        Game game = new Game();
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