import java.util.*;

public class Histogram
{
   private String line;
   private final static int[] numbers = {0,1,2,3,4,5,6,7,8,9};
   private int[] histogram;
   private Scanner reader;
   
   public Histogram()
   {
      line = "";
     
   }
   
   public Histogram(String lineOfNums)
   {
      line = lineOfNums;
      histogram = new int[10];
   }
   
   public void setString(String lineOfNums)
   {
      line = lineOfNums;
      histogram = new int[10];
   }
   
   public String toString()
   {
      reader = new Scanner(line);
      while(reader.hasNextInt())
         {
            int num = reader.nextInt();
            
            for(int x = 0; x<numbers.length;x++)
            {
               if(num == numbers[x])
                  {
                     histogram[x] = histogram[x] + 1;
                  }
            }
         }
      int totalNumber = 0;
      for(int i = 0; i<histogram.length; i++)
      {
         totalNumber = totalNumber + histogram[i];
      }
      
      return "0 - " + histogram[0] + "\n1 - " + histogram[1] + "\n2 - " + histogram[2] + "\n3 - " + histogram[3] + "\n4 - " + histogram[4] + "\n5 - " + histogram[5] + "\n6 - " + histogram[6] + "\n7 - " + histogram[7] + "\n8 - " + histogram[8] + "\n9 - " + histogram[9] + "\nThe number of digits: " + totalNumber;
   }
   
}