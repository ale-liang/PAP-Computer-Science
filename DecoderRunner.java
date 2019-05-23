import static java.lang.System.*;
import java.util.Scanner;

public class DecoderRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(in);
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		Decoder prog = new Decoder(letter);
		out.println(prog);   

		out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		prog.setLetter(letter);
		out.println(prog);  
      
      out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		prog.setLetter(letter);
		out.println(prog);  
      
      out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		prog.setLetter(letter);
		out.println(prog);  
      
      out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		prog.setLetter(letter);
		out.println(prog);  
      
      out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		prog.setLetter(letter);
		out.println(prog);  
      
      out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		prog.setLetter(letter);
		out.println(prog);  
      
      out.print("Enter a letter :: ");
		letter = keyboard.next().charAt(0);
		prog.setLetter(letter);
		out.println(prog);  
      

		// add more test cases (enough to match Sample Output)
	}
}
