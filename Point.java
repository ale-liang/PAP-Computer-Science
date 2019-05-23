public class Point //class
{
   private double x, y; //instance variables
   
   public Point() //default constructor
   {
   x=0;
   y=0;
   }
   
   public Point(double thisX, double thisY)//overloaded constructor
   {
   x = thisX;
   y = thisY;
   }
   
   public void setCoord(double thisX, double thisY) //mutator method - changes the values in the instance variables
   {
   x = thisX;
   y = thisY;
   }
   
   public String toString()
   {
      String output = "(" + x + "," + y + ")";
      return output;
   }
}