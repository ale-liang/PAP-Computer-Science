public class AddSub
{
	public static double check( int a, int b )
	{

      if (a > b)
         {
            return a-b;
         }
      if (a < b) 
         {
            return b-a;
         }    
      if (a == b)
         {
            return a + b;
         }
      return 0;
	}
}
