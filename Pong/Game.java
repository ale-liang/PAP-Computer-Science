import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.lang.Math;
import java.awt.Font;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import sun.audio.*;    //import the sun.audio package
import java.io.*;
import java.applet.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Game extends JPanel implements Runnable, KeyListener

{
   private BufferedImage back;
   private Paddle player1;
   private Ball ball;
   private int key;
   private Paddle player2;
   private int score1, score2;
   public Game()
   {
      new Thread(this).start();
      player1 = new Paddle(20,300,15,60,Color.WHITE);
      ball = new Ball();
      key = -1;
      this.addKeyListener(this);
      player2 = new Paddle(750,300,15,60,Color.WHITE);
   }
   
   public void run()
   {
      try
      {
         while(true)
         {
            Thread.currentThread().sleep(5);
            repaint();
         }
      }
      catch(Exception e)
      {}
   }
   
   public void keyTyped(KeyEvent e)
   {}
   
   public void keyPressed(KeyEvent e)
   {
      key = e.getKeyCode();
      if (key == 87)
         {
            player1.setdy(-1);
         }
      else if (key == 83)
         {
            player1.setdy(1);
         }
      else if (key == 32)
         {
            ball.setdx(1);
            ball.setdy(1);
         }
     else if (key ==38)
         {
            player2.setdy(-1);
         }
     else if (key == 40)
         {
            player2.setdy(1);
         }
     else if (key == 82)
         {
            score1 = 0;
            score2 = 0;
            ball.setdx(0);
            ball.setdy(0);
            ball.reset();
         }
   }
   
   public void keyReleased(KeyEvent e)
   {
      key = e.getKeyCode();
      if (key == 87 || key == 83)
         {
            player1.setdy(0);
         }
      else if (key == 40 || key == 38)
         {
            player2.setdy(0);
         }
         
     
   }
   
   public void paint(Graphics g)
   {
      Graphics2D twoDgraph = (Graphics2D)g;
      if (back == null)
         back = (BufferedImage)(createImage(getWidth(),getHeight()));
      Graphics g2d = back.createGraphics();
      g2d.setFont(new Font("LucidaSans",Font.PLAIN,25));
      g2d.clearRect(0,0,getSize().width, getSize().height);
      g2d.drawString("Player 1 Score: " + getScore1(),100,50);
      g2d.drawString("Player 2 Score: " + getScore2(),500,50);
      g2d.setColor(player1.getColor());
      g2d.fillRect(player1.getX(),player1.getY(),player1.getW(),player1.getH());
      g2d.setColor(ball.getColor());
      g2d.fillRect(ball.getX(),ball.getY(),ball.getW(),ball.getH());
      g2d.setColor(player2.getColor());
      g2d.fillRect(player2.getX(),player2.getY(),player2.getW(),player2.getH());
      if (score1 == 5 || score2 == 5)
         {
            ball.reset();
            ball.setdx(0);
            ball.setdy(0);
            g2d.setFont(new Font("LucidaSans",Font.PLAIN,60));
            g2d.drawString("GAME OVER", 250, 275);
            playGameOver();
            
         }
      move();
      twoDgraph.drawImage(back,null,0,0);
      
    
   }
   

   
   public void move()
   {
      ball.move();
      player1.move();
      player2.move();
      ball.collision(player1);
      ball.collision(player2);
   }
   
   public int getScore1()
   {
      if(ball.getX() >= 775)
         {
         score1 = score1 + 1;
         ball.reset();
         ball.setdx(-1);
         ball.setdy(1);
         playScorePoint();
         }
      return score1;
   }
   
   public int getScore2()
   {
      if(ball.getX() <= 0)
         {
         score2 = score2 + 1;
         ball.reset();
         ball.setdx(1);
         ball.setdy(-1);
         playScorePoint();
         }
      return score2;
   }
   
   
   public void playGameOver() {
    try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("gameOver.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
}

   public void playScorePoint() {
    try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("scorePoint.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
}
}