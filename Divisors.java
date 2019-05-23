public class Divisors
{
	public static String getDivisors( int number )
	{
		 String d = "";
       int n = 1;

      while(number > n)
            {
               if(number % n == 0)
               {
               d = d + n + " ";
               }
               n = n+1;
            }
            return d;
         }
       
      
	}
