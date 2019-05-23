//Alex Liang
// October 3rd, 2018
// 2nd Period
// Big House Lab

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class bigHouse extends Canvas
{
   public bigHouse()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {     
      window.setColor(Color.GREEN);
      window.fillRect(100,50,600,100);
      window.setColor(Color.BLUE);
      window.fillRect(200,150,400,400);
      window.setColor(Color.WHITE);
      window.fillRect(300,450,200,150);
      window.setColor(Color.YELLOW);
      window.fillRect(250,250,75,75);
      window.fillRect(450,250,75,75);
   }
}
