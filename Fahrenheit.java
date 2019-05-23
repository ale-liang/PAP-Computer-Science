public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
   fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
      celsius = (fahrenheit - 32) * 5/9;
		//add code to convert fahrenheit to celsius
		return celsius;
	}

	public void print()
	{
      System.out.print(String.format("%.2f",fahrenheit));
      System.out.print(" degrees Fahrenheit == ");
		System.out.println(String.format("%.2f",getCelsius()) + " degrees Celsius");
	}
}
