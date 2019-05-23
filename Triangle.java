import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Triangle(int a, int b, int c)
	{
      sideA = a;
      sideB = b;
      sideC = c;
	}


	public void setSides(int a, int b, int c)
	{
      sideA = a;
      sideB = b;
      sideC = c;

	}

	public void calcPerimeter( )
	{
      perimeter = (double)sideA + sideB + sideC;

	}

	public void calcArea( )
	{
		double s;
      s = perimeter / 2;
      theArea = (double) Math.sqrt(s * (double)(s-sideA) * (double)(s-sideB) * (double)(s-sideC));

	}

	public void print( )
	{
		System.out.println("\n" + sideA + " " + sideB + " " + sideC + "\n" + "Area == " + (String.format("%.5f",theArea)));
	}
}
