import java.util.ArrayList;

/**
 * saves the state of game then is able to load the previous state
 */
public class Originator {
    private static ArrayList<Integer> data = new ArrayList<Integer>();
    private static Double timepassed;

    /**
     * Saves state of game
     */
    static void saveState() {
        data=Game.getData();
        timepassed = Game.elapsed;
    }

    /**
     * Loads previous state
     */
    public static void loadState(){
        Game.setData(data,timepassed);
    }
}
