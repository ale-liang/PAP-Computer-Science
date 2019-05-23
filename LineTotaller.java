import static java.lang.System.*;
import java.util.*;

public class LineTotaller
{
   private String line;

	public LineTotaller() //constructor
	{
		setLine("");
	}

	public LineTotaller(String s) //constructor
	{		
      line = s;
	}

	public void setLine(String s) //sets the input of the program
	{
      line = s;
	}

	public int getSum() //actually sums up numbers in given string
	{
      Scanner chop = new Scanner(line);
		int total = 0;
         while(chop.hasNextInt())
         {
         total = total + chop.nextInt();
         }
		return total;
	}

	public String getLine() //prints out input
	{
      
		return line;
	}

	public String toString() //prints out inputr
	{
		return getLine();
	}
}
