//Alex Liang
// October 3rd, 2018
// 2nd Period
// Robot Lab

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class robot extends Canvas
{
   public robot()
   {
   setSize(1000,1200);
   setBackground(Color.WHITE);
   setVisible(true);
   }
   
   public void paint(Graphics window)
   {
      window.setColor(Color.BLUE);
      window.drawString("Robot Lab",35,35);
      
      Head(window);
      UpperBody(window);
      LowerBody(window);
      
   }
   
   public void Head(Graphics window)
   {
      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

		window.setColor(Color.GREEN);
      window.fillOval(275, 225, 70, 40);

      window.setColor(Color.GREEN);
      window.fillOval(475, 225, 70, 40);
      
      window.setColor(Color.BLACK);
      window.fillOval(390, 300, 30,30);
      
      window.setColor(Color.RED);
      window.drawArc(275, 300, 250, 100, 200, 170);
    }
    public void UpperBody(Graphics window)
    {
      window.setColor(Color.BLUE);
      window.fillRect(300,500,200,300);
      
      window.setColor(Color.BLACK);
      window.drawLine(300,500,100,400);
      
      window.setColor(Color.BLACK);
      window.drawLine(500,500,600,400);
    }
    public void LowerBody(Graphics window)
    {
      window.setColor(Color.RED);
      window.fillRect(300,800,200,100);
      
      window.setColor(Color.BLACK);
      window.drawLine(300,900,300,1000);
      
      window.setColor(Color.BLACK);
      window.drawLine(500,900,500,1000);
    }
}