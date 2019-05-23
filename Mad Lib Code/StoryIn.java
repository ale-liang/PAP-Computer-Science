import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class StoryIn
{
   private Scanner userInput;

     
   public void getNouns(String nouns) throws IOException //takes the input from the user to create a file of nouns for the story to use
   {
      userInput = new Scanner(nouns);
      PrintWriter output = new PrintWriter("nouns.dat");
      while(userInput.hasNext())
      {
         output.println(userInput.next());
      }
      output.close();
   }
   
   public void getVerbs(String verbs) throws IOException //takes the input from the user to create a file of verbs for the story to use
   {
      userInput = new Scanner(verbs);
      PrintWriter output = new PrintWriter("verbs.dat");
      while(userInput.hasNext())
      {
      output.println(userInput.next());
      }
      output.close();
   }
   
   public void getAdjs(String adjectives) throws IOException //takes the input from the user to create a file of adjectives for the story to use
   {
      userInput = new Scanner(adjectives);
      PrintWriter output = new PrintWriter("adjs.dat");
      while(userInput.hasNext())
      {
         output.println(userInput.next());
         
      }
      output.close();
   }
   
}