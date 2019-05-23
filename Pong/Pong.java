import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
public class Pong extends JFrame
{
   private static final int WIDTH = 800;
   private static final int HEIGHT = 600;
   
   public Pong()
   {
      super("Pong");
      setSize(WIDTH, HEIGHT);
      Game play = new Game();
      ((Component)play).setFocusable(true);
      setBackground(Color.BLUE);
      getContentPane().add(play);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }
   
   public static void main(String[] args)
   {
      Pong run = new Pong();
      
         
   }
}