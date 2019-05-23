import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FileTwo
{
   public static void main(String[] args) throws IOException
   {
      Scanner file = new Scanner(new File("filetwo.dat"));
      /* count = file.nextInt();
      file.nextLine(); //clears out the enter key to get down to the next line
      System.out.println("This file has " +count+" records"); //make sure i have the number
      for(int i =1; i<=count; i ++)
      {
         System.out.println("Line " +i+ " is: "+ file.nextLine());
      }
      */
      
      int linecount = 1;
      while(file.hasNextLine())
      {
         System.out.println("Line "+ linecount+ " is: " + file.nextLine());
         linecount ++;
      }
   }
}