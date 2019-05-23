public class CountPairs
{   
   public static String pairCounter(String work)
   {
   int number = 0;
   for(int n = 0; n <= work.length()-2;n= n+1)
      {
         
         if((work.substring(n,n+1).equals(work.substring(n+1,n+2))))
            {
            number+= 1;
            }
      }
   return "" + number;
   }



}