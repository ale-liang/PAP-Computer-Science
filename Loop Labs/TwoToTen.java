public class TwoToTen
{
	private String binary;

	public TwoToTen()
	{
   binary = "";
	}

	public TwoToTen(String bin)
	{
   binary = bin;
	}

	public void setTwo(String bin)
	{
   binary = bin;
	}

	public long getBaseTen( )
	{
      
		long ten=0;

         for( int n =(binary.length() - 1); n >= 0; n = n-1)
         {
         int numbers = Integer.parseInt(binary.substring(n,n+1));
              if(numbers == 1)
               {
               ten +=(long) Math.pow(2,(binary.length()-(binary.length()-n)));
               }
         }
		return ten;
	}

	public String toString()
	{
      long ten = getBaseTen();
		return binary + " == " + ten;
	}
}
