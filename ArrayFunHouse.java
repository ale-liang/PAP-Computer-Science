public class ArrayFunHouse
{

   public ArrayFunHouse()
   {
   
   }
   
   public static int getCount(int[] array, int number)
   {
   int count = 0;
   for(int item : array)
      {
         if(item == number)
         {
            count = count + 1;
         }
      } 
   return count;
   }
   
   public static int getSum(int[] array, int start, int stop)
   {
   int sum = 0;
   for(int n = start; n <= stop; n ++)
      {
         sum = sum + array[n];
      }
   return sum;
   }
   
   public String toString(int[] array)
   {
      String line = "[";
      for(int i = 0; i < array.length; i ++)
      {
         line = line + array[i] +", ";
      }
      line = line + "]";
      return line;
   }
   
   public static int[] removeVals(int[] array, int number)
   {
      int total = 0;
      for(int removed: array)
      {
         if(removed == number)
         {
         total++;
         }
      }
      int remainder = array.length - total;
      int[] newArray = new int[remainder];
      int i = 0;
      for(int num: array)
      {
         if(num != number)
         {
            newArray[i] = num;
            i++;
         }
      }
      return newArray;
   }
}