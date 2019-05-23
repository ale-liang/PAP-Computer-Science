public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
   start = 0;
   stop = 0;
	}

	public LoopStats(int beg, int end)
	{
   start = beg;
   stop = end;
	}

	public void setNums(int beg, int end)
	{
   start = beg;
   stop = end;

	}

	public int getEvenCount()
	{
		int evenCount=0;

      
         for(int n = start; n<= stop;n= n+1)
         {
            if(n%2 == 0)
               {
               evenCount = evenCount + 1;
               }
         }



		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
         for(int n = start; n<= stop;n= n+1)
         {
            if(n%2 == 1)
               {
               oddCount = oddCount + 1;
               }
         }




		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
         for(int n = start; n<= stop;n= n+1)
            {
            total = total + n;
            }

		return total;
	}
	
	public String toString()
	{
      int total = getTotal();
      int even = getEvenCount();
      int odd = getOddCount();
		return start + " " + stop + "\n" + "total " + total + "\n" + "even count " + even + "\n" + "odd count " + odd;
	}
}
