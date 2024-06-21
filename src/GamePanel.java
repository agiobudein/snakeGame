import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 100;

    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 5;
    int applesEaten;
    int applesX;
    int applesY;
    char direction = 'R';
    boolean running = false;
    Random random;
    Timer timer;


    public GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setFocusable(true);
        this.setBackground(Color.PINK);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame(){

    }

    public void paintComponent(Graphics g){

    }

    public void draw(Graphics g){

    }

    public void newApples(){

    }

    public void move(){

    }

    public void checkApples(){

    }

    public void checkCollision(){

    }

    public void gameOver(Graphics g){

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class MyKeyAdapter extends KeyAdapter{

        public void keyPressed(KeyEvent e){

        }
    }
}
