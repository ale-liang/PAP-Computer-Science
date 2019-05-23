import static java.lang.System.*;
import java.util.Scanner;

public class MorseCodeRunner
{
	public static void main( String args[] )
	{
		
		
		MorseCode prog = new MorseCode('A');
		out.println(prog);   
      
     
      
      prog.setChar('B');     
      out.println(prog);
      
     
      
      prog.setChar('3');     
      out.println(prog);
      
      
      prog.setChar('Z');     
      out.println(prog);
      
      
      
      prog.setChar('8');     
      out.println(prog);
      
      
      
      prog.setChar('F');     
      out.println(prog);
      
      
   
      prog.setChar('0');     
      out.println(prog);
      
   }
   
}