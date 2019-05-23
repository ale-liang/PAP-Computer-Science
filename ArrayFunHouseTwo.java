public class ArrayFunHouseTwo
{
   //goingUp() will return true if all numbers
   //in numArray are in increasing order
   //[1,2,6,9,23] returns true
   //[9, 11, 13, 8]  returns false
   public static boolean goingUp(int[] numArray)
   {
   boolean truth = false;
   for( int i = 0; i < numArray.length-1; i ++)
      {
         if(numArray[i] < numArray[i+1])
         {truth = true;}
         else
         {truth = false;}
      } 
   return truth;
   }

   //goingDown() will return true if all numbers
   //in numArray are in decreasing order
   //[31,12,6,2,1] returns true
   //[31, 20, 10, 15, 9] returns false
   public static boolean goingDown(int[] numArray)
   {
   boolean truth = false;
   for( int i = 0; i < numArray.length-1; i ++)
      {
         if(numArray[i] > numArray[i+1])
         {truth = true;}
         else
         {truth = false;}
      } 
   return truth;      
   }

   //getValuesBiggerThanX will return an array that contains
   //count number of values that are larger than parameter x
   //[1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
   public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x)
   {
      int[] cutArray = new int[count];
      int i = 0;
      for(int pos = 0; pos < numArray.length; pos++)
      {
         if(numArray[pos] > x)
         {
            if(i < count)
            {
            cutArray[i] = numArray[pos];
            
            }
            i++;
         }
         
      }
      
      return cutArray;
   }
   

}
