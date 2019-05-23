public class Factorial
{
	private int number;

	public Factorial()
	{
   number = 0;
	}

	public Factorial(int num)
	{
   number = num;
	}

	public void setNum(int num)
	{
   number = num;
	}

	public int getNum()
	{
		return number;
	}

	public long getFactorial( )
	{
		long factorial=1;
      
      for(long n = 1; n <= (long)number; n = n + 1)
         {
            factorial = factorial*n;
         }



		return factorial;
	}

	public String toString()
	{
		return "factorial of " + getNum() + " is "+ getFactorial()+"\n";
	}
}
