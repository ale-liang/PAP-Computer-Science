import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Font;

public class DrawGraphics extends Canvas
{
   public DrawGraphics()
   {
      setBackground(Color.WHITE);
   }

   public void paint( Graphics window )
   {
      //draw grid - do not change 
      window.setColor(Color.BLACK);
      window.drawLine(0,50,0,650);      //vertical line
      window.drawLine(250,50,250,650);  //vertical line
      window.drawLine(500,50,500,650);  //vertical line
      window.drawLine(750,50,750,650);  //vertical line
      window.drawLine(1000,50,1000,650);  //vertical line
      window.drawLine(0,650,1000,650);  //horizontal line
      window.drawLine(0,350,1000,350);  //horizontal line
      window.drawLine(0,50,1000,50);    //horizontal line

      //call method to draw the heading passing string, x, y
      FillBoxes.drawHeading(window, "Alex Liang",400, 38) ; 
      
      //call method to draw horizontal lines passing x1, y1, x2, y2 of first line
      FillBoxes.drawHorizontalLines(window, 0, 55, 250, 55);
      
     //call method to draw blue vertical lines passing x1, y1, x2, y2 of first line
     FillBoxes.drawVerticalLines(window,255,50,255,350);
     //call method to draw black diagonal dots (3x3 squares) passing x and y of first dot
     FillBoxes.drawBlackDots(window,505,300,3,3);
     
     
     //call method to draw green concentric circles passing x, y, and size of first circle
     FillBoxes.drawConcentricCircles(window,875,182,10,10); 
     
     //call method to draw purple concentric ovals passing x, y, width, and height of first oval
     FillBoxes.drawConcentricOvals(window,120,500,10,20);
          
     //call method to draw pink concentric arcs passing, x, y, width, height, start angle, and stop angle
     FillBoxes.drawArcs(window,230,620,50,50,0,90); 
     
     //call method to draw gold sphere (this is done with ovals - two separate loops or nested loops)
     FillBoxes.drawConcentricRectangles(window, 610, 480, 30,50); 
     
     FillBoxes.drawSphere(window, 770,477,200,20,860,385,20,200); 
   }
}
