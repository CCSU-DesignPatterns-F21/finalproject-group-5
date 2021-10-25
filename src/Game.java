
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class Game extends JPanel {

    private static int x =200;
    private static int y = 100;

    private static int evilflagx = 500;
    private static int evilflagy = 100;
    private static int evilflagtaken = 0;


    static void changeX(int offset) {
        x += offset;
    }

    static void changeY(int offset) {
        y += offset;
    }

    @Override
    public void paint(Graphics g) {
        if(x==evilflagx&&y==evilflagy)
            evilflagtaken=1;
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
        g2d.fillRect(100,100,30,30);
        if(evilflagtaken==0)
            g2d.drawRect(evilflagx, evilflagy, 30, 30);
        g2d.drawOval(400, 100, 30, 30);

    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("CTF");
        Game game = new Game();
        frame.add(game);
        frame.setSize(400, 400);
        frame.addKeyListener((KeyListener) new KeyboardInput());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        while (true) {
            //game.moveBall();
            game.repaint();
            Thread.sleep(10);
        }
    }
}