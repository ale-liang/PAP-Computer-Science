public class DigitCounter
{
   public static int countDigits( int number )
	{
   int count = 0;
   
   while (number > 0)
      {
         count = count + 1;
         number = number / 10;
      }
   
   return count;  
	}
   
}
