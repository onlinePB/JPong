package jpong;

/**
 *
 * @author Ryan Wilson
 * @version 0.1.0 27/02/2019
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game("JPong", 800, 600);
        game.start();
    }
    
}
