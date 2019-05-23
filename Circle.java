import java.lang.Math;
public class Circle
{
	private double radius;
	private double area, circumference;

	public void setRadius(double rad)
	{
   radius = rad;
	}

	public void calculateArea( )
	{
   area = radius * radius * Math.PI;
	}
	
	public void calculateCircumference( )
	{
   circumference = 2 * radius * Math.PI;
	}

	public void print( )
	{
      System.out.print("When the radius is " + radius);
      System.out.print(", the area is ");
      System.out.print(String.format("%.3f",area));
      System.out.print(" and the circumference is ");
      System.out.print(String.format("%.3f",circumference));
		//print a sentence saying "When the radius is ???, the area is ??????? and the circumference is ???????"
		//both area and circumference should be rounded to the nearest thousandth (hint: use formatted print)
	}
}