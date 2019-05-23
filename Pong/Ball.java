import java.awt.Color;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import sun.audio.*;    //import the sun.audio package
import java.io.*;
import java.applet.*;
import java.io.File;
public class Ball
{
   private int x,y,width,height,dy,dx;
   private Color color;
   private boolean moveup, moveright;
   private int score1, score2;
   public Ball()
   {
   x = 392;
   y = 292;
   width = 16;
   height = 16;
   color = Color.WHITE;
   dy = 0;
   dx = 0;
   moveup = true;
   moveright = true;
   }
   
   public int getX(){return x;}
   public int getY(){return y;}
   public int getW(){return width;}
   public int getH(){return height;}
   public Color getColor(){return color;}
   
   
   public void setdx(int cx)
   { dx = cx;}
   public void setdy(int cy)
   { dy = cy;}
   
   public void move()
   {
      if(moveup)
      {
         y -= dy;
      }
      else
      {
         y += dy;
      }
      
      if(moveright)
      {
         x += dx;
      }
      else
      {
         x -= dx;
         }
   /*   if(x >= 775)
         {
            x = 392;
            y = 292;
            dx = 1;
            dy = -1;
            
         }
      else if(x <= 0)
         {
            x = 392;
            y = 292;
            dx = -1;
            dy = 1;
            
         } */
      
      
      if(y <= 0 || y >= 550)
         {setMoveup();}
   }
   
   public void setMoveright()
   { moveright = !moveright;}
   
   public void setMoveup()
   {  moveup = !moveup;}
   
   public void collision(Paddle p)
   { 
      if (p.getY() <= getY() + getH() && p.getY() + p.getH() >= getY() && p.getX()+p.getW() >= getX() && p.getX() <= getX() + getW())
         {
            
            /*System.out.println("collusion");
            setdx(0);
            setdy(0); */
            
            
            setMoveright();
            playHitPaddle();
         }
      
   } 
   
   public void reset()
   {
      x = 392;
      y = 292;
   }
   

   public void playHitPaddle() {
    try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("hitPaddle.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
}
   
}