import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class FileDemo
{
   public static void main(String[] args) throws IOException
   {
      Scanner file = new Scanner(new File("fileone.dat"));
      int count = file.nextInt();
      
      
      
      
      /*int count = file.nextInt();
      int sum = 0;
      System.out.println("There are " +count+ " records in this file.");
      for(int i = 0; i<count; i++)
         {
         
         sum += file.nextInt();
         } 
         int sum = 0;
      while(file.hasNextInt())
      {
         sum += file.nextInt();
      }
      System.out.println("The sum of the " +  " numbers is "+ sum);*/
   }
}