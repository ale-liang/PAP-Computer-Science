import static java.lang.System.*;
import java.util.*;

public class LineBreaker
{
   private String line;
   private int numOfLines;
   
   public LineBreaker() //constructor
   {
      line = "";
      numOfLines = 0;
   }
   
   public LineBreaker(String s, int n) //constructor
   {
      line = s;
      numOfLines = n;
   }
   
   public void setLineBreaker(String s, int n) //sets the input of program
   {
      line = s;
      numOfLines = n;
   }
   
   public String getLineBreaker() //breaks program into however many lines
   {
   Scanner chop = new Scanner(line);
   String answer = "";
      while(chop.hasNext())
         {
            for(int n = 1; n <= numOfLines; n ++)
            {
               if(chop.hasNext())
               {
               answer = answer + chop.next() + ""; 
               }
            }
            answer = answer + "\n";
         }
     return answer;
   }
   
   public String toString() //prints out result of getLineBreaker()
   { return getLineBreaker(); } 
}