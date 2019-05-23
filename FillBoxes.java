
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
public class FillBoxes
{
   public static void drawHeading(Graphics g, String name, int x, int y)
   {
      Font heading = new Font("Arial",Font.BOLD,36);
      g.setFont(heading);
      g.drawString(name,x,y);
 
   }
   
   public static void drawHorizontalLines(Graphics g, int x1, int y1, int x2, int y2)
   {
      // Draw Red Horizontal Lines
      g.setColor(Color.RED);     
      for (int k = 1; k <= 30; k++)
      {
         g.drawLine(x1,y1,x2,y2);
         y1 += 10;
         y2 += 10;
      }

   }
   
   public static void drawVerticalLines(Graphics g, int x1, int y1, int x2, int y2)
   {
      g.setColor(Color.BLUE);
      for(int k = 1; k <= 25; k++)
      {
         g.drawLine(x1,y1,x2,y2);
         x1 += 10;
         x2 += 10;
      }
   }
   
   public static void drawBlackDots(Graphics g, int x, int y, int w, int h)
   {
      g.setColor(Color.BLACK);
      for(int k = 1; k<=25; k++)
      {
         g.fillRect(x,y,w,h);
         x += 10;
         y -= 10;
      }
   }
   
   public static void drawConcentricCircles(Graphics g, int x, int y, int w, int h)
   {
      g.setColor(Color.GREEN);
      for(int k = 1; k <= 12; k++)
      {
         g.drawOval(x,y,w,h);
         x -= 10;
         y -= 10;
         w += 20;
         h += 20;
      }
   }
   public static void drawConcentricOvals(Graphics g, int x, int y, int w, int h)
   {
      g.setColor(Color.MAGENTA);
      for(int k = 1; k <= 14; k++)
      {
         g.drawOval(x,y,w,h);
         x -= 5;
         y -= 10;
         w += 10;
         h += 20;
      
      }
   }
   public static void drawArcs(Graphics g, int x, int y, int w, int l, int sa, int aa)
   {
      g.setColor(Color.PINK);
      for(int k = 1; k <= 20; k++)
      {
         g.drawArc(x,y,w,l,sa,aa);
         y -= 10;
         x -= 10;
         w += 20;
         l += 20;
      }
   }
   
   public static void drawConcentricRectangles(Graphics g, int x, int y, int w, int h)
   {
      g.setColor(new Color(165,42,42));
      for(int k = 1; k <= 10; k++)
      {  
         g.drawRect(x,y,w,h);
         x -= 10;
         y -= 10;
         w += 20;
         h += 20;
      }
   }  
   
   public static void drawSphere(Graphics g, int x1, int y1, int w1, int h1, int x2, int y2, int w2, int h2)
   {
      g.setColor(new Color(225,223,0));
      
      for(int k = 1; k <=10 ; k++)
      {
         g.drawOval(x1,y1,w1,h1);
         y1 -= 10;
         h1 += 20;
      }
      for(int n = 1; n <=10; n ++)
      {
         
         g.drawOval(x2,y2,w2,h2);
         x2 -= 10;
         w2 += 20;
      }
   } 
}
