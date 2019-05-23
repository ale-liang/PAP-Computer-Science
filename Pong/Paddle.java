import java.awt.Color;

public class Paddle
{
   private int x;
   private int y;
   private int width;
   private int height;
   private Color color;
   private int dy;
   
   public Paddle()
   {
      x= 0;
      y= 0;
      width = 0;
      height = 0;
      dy = 0;
      color = Color.WHITE;
   }
   
   public Paddle (int xcoor, int ycoor, int w, int h, Color c)
   {
      x = xcoor;
      y = ycoor;
      width = w;
      height = h;
      color = c;
      dy = 0;
   }
   
   public int getX(){return x;}
   public int getY(){return y;}
   public int getH(){return height;}
   public int getW(){return width;}
   public Color getColor(){return color;}
   
   public void setdy(int d)
   {
      dy = d;
   }
   
   public void move()
   {
      y += dy;
      if(y < 0)
         {y = 0;}
      else if (y > 600 -height -40)
         { y = 600 - height -40;}
         
   }
}