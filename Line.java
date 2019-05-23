
public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)  //constructor
	{

       xOne =  x1;
       yOne =  y1;
       xTwo =  x2;
       yTwo =  y2;

	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
       xOne =  x1;
       yOne =  y1;
       xTwo =  x2;
       yTwo =  y2;
	}

	public void calculateSlope( )
	{
   slope = (double)(yOne - yTwo) / (xOne - xTwo);
    
		// you can assume the slope will be defined, for now……

	}

	public void print( )
	{
      System.out.print("The slope is ");
      System.out.println(String.format("%.2f",slope));

	}
}
