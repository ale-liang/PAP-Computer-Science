import java.util.*;
import java.io.*;

public class HistogramRunner
{

   public static void main(String[] args) throws IOException
   {
      Scanner lineReader = new Scanner(new File("histogram.txt"));
      Histogram test = new Histogram();
      int lineNumber = 1;
      
      while(lineReader.hasNext())
      {
         String dataLine = lineReader.nextLine();
         System.out.println("Line " + lineNumber + " Histogram");
         test.setString(dataLine);
         System.out.println(test);
         lineNumber++;
      }
      
        
   }
}