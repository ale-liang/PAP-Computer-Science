import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
      yPos = y;
      width = wid;
      height = ht;
      color = col;
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillOval(xPos, yPos, width, height);
      window.drawLine(xPos, yPos, xPos - xPos/2, yPos- yPos/2);
      window.drawLine(xPos + width, yPos + height, xPos + width + xPos/2, yPos + height + yPos/2);
      window.drawLine(xPos + width, yPos, xPos + width + xPos/2, yPos - yPos/2);
      window.drawLine(xPos, yPos + height, xPos - xPos/2, yPos + height + yPos/2);
      
      
      
   }

   
   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}
