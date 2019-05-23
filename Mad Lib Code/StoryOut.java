import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
public class StoryOut
{
   public static void main(String[] args) throws IOException
   {
      Scanner userInput = new Scanner(System.in);
      StoryIn test = new StoryIn();
      System.out.println("List out 7 nouns separated by spaces :: "); //list of nouns for story to use
      String nouns = userInput.nextLine();
      System.out.println("List out 10 verbs separated by spaces :: "); //list of verbs for story to use
      String verbs = userInput.nextLine();
      System.out.println("List out 4 adjectives separated by spaces :: "); //list of adjectives for story to use
      String adjectives = userInput.nextLine();
      
      test.getNouns(nouns); //Inputing all the strings of nouns, verbs, adjectives and input it into the methods of StoryIn class
      test.getVerbs(verbs);
      test.getAdjs(adjectives);
      
      PrintWriter finalStory = new PrintWriter("finalStory.dat"); //obstantiate a file for finished story
      Scanner storyReader = new Scanner(new File("story.dat")); //Scanner of the original story file to replace words with
      Scanner nFile = new Scanner(new File("nouns.dat")); //scanner to read all of the nouns in the file
      Scanner vFile = new Scanner(new File("verbs.dat")); // scanner to read all of the verbs in the file
      Scanner aFile = new Scanner(new File("adjs.dat")); //scanner to read all of the adjectives in the file
      //code that actually replaces the <noun> <verb> <adjective> in the story with the given input from the user

      while(storyReader.hasNextLine()) //checks if the story has another line
            {
         String individualLine = storyReader.nextLine();
         Scanner individualLineReader = new Scanner(individualLine);
         String finalLine = "";
         
         while(individualLineReader.hasNext()) //checks if the story has another word in the same line
         {
            String individualWord = individualLineReader.next();
            switch(individualWord) //replaces each of the <noun> <verb> <adjective> with given user input
            {
               case "<noun>": individualWord = individualWord.replace("<noun>", nFile.nextLine()); break;
               case "<noun>,":individualWord = individualWord.replace("<noun>,", nFile.nextLine()+ ","); break;
               case "<noun>.": individualWord = individualWord.replace("<noun>.", nFile.nextLine() + "."); break;
               case "<noun>!": individualWord = individualWord.replace("<noun>!", nFile.nextLine() + "!"); break;


               case "<verb>": individualWord = individualWord.replace("<verb>", vFile.nextLine()); break;
               case "<verb>,": individualWord = individualWord.replace("<verb>,", vFile.nextLine()+","); break;
               case "<verb>.": individualWord = individualWord.replace("<verb>.", vFile.nextLine()+"."); break;

               case "<adjective>": individualWord = individualWord.replace("<adjective>", aFile.nextLine()); break;
               case "<adjective>,": individualWord = individualWord.replace("<adjective>,", aFile.nextLine() + ","); break;
               case "<adjective>.": individualWord = individualWord.replace("<adjective>.", aFile.nextLine() + "."); break;
            }
            finalLine = finalLine + individualWord + " ";
         }
         System.out.println(finalLine); //prints out to screen to see what finished product looks like
         finalStory.println(finalLine); //prints out to the finished story file
      }
      
    finalStory.close(); //close file
   
   }
}