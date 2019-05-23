import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
      setCoordinates(0,0,0,0);
      distance = 0.0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
      xOne = x1;
      yOne = y1;
      xTwo = x2;
      yTwo = y2;


	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
      xOne = x1;
      yOne = y1;
      xTwo = x2;
      yTwo = y2;



	}

	public void calcDistance()
	{
      distance = (double) Math.sqrt((double)Math.pow(yTwo - yOne, 2) + (double)Math.pow(xTwo - xOne, 2));


	}

	public void print( )
	{
      out.print("distance == ");
      out.println(String.format("%.3f",distance));


	}
}
