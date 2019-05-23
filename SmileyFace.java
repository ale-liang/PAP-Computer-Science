//Alex Liang
// October 2nd, 2018
// 2nd Period
// Smiley Face Lab

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

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
}
