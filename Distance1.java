import java.lang.Math.*;

public class Distance1
{
	private int x1,y1,x2,y2;

	public Distance1()
	{
      setCoordinates(0,0,0,0);

	}

	public Distance1(int xOne, int yOne, int xTwo, int yTwo)
	{
      x1 = xOne;
      y1 = yOne;
      x2 = xTwo;
      y2 = yTwo;

	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
      x1 = xOne;
      y1 = yOne;
      x2 = xTwo;
      y2 = yTwo; 

	}

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0;
      distanceA = (double) (Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2)));
      distanceB = (double) (Math.sqrt(Math.pow(x2,2) + Math.pow(y2,2)));
      String result = "";
      if (distanceA < distanceB)
         {
         return result = "A is closer to (0,0).";
         
         }
      
		return result="B is closer to (0,0).";






		
	}
	
	public String toString()
	{
		return "";
	}
}
