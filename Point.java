public class Point
{
   private int xCoor, yCoor;
   
   public Point()
   {
   xCoor = 0;
   yCoor = 0;
   }
   
   public Point(int x, int y)
   {
   xCoor = x;
   yCoor = y;
   }
   
   public int getX()
   {
      return xCoor;
   }
   
   public int getY()
   {
      return yCoor;
   }
   
   public Point findMidPoint(Point other)
   {
      Point result = new Point((this.xCoor + other.getX())/2, (this.yCoor + other.getY())/2 );
      return result;
   
   }
   
   public String toString()
   {
   return "(" + xCoor +"," + yCoor + ")";
   }


}