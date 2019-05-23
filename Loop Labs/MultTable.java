public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number=stop=0;
	}

	public MultTable(int num, int end)
	{
   number = num;
   stop = end;
	}

	public void setTable(int num, int end)
	{
   number = num;
   stop = end;
	}

	public void printTable( )
	{
   int ans = 0;
   for(int n=1; n <= stop; n = n+1)
      {
         System.out.println( n + " X " + number + " = " + (number*n));
      }
	}
}
