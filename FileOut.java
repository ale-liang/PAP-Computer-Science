import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class FileOut
{
   public static void main(String args[]) throws IOException
   {
      Scanner fileIn = new Scanner(new File("filetwo.dat"));
      PrintWriter fileOut = new PrintWriter(new FileWriter("fileout.dat"));
      while(fileIn.hasNext())
      {
         fileOut.println(fileIn.next());
      }

      fileOut.close();
   }
}