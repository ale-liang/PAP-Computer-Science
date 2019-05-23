
public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
   wordOne = "";
   wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
   wordOne = one;
   wordTwo = two;
	}

	public void setWords(String one, String two)
	{
   wordOne = one;
   wordTwo = two;
	}

	public boolean checkEquality( )
	{

      if (wordOne.equals(wordTwo))
         {
         return true;
         }
      else
         {
		   return false;
         }
	}

	public String toString()
	{
      String output = "";
      boolean bonk = checkEquality();
   if (bonk)
      {
      output = wordOne + " does have the same letters as " + wordTwo + "\n";
      }
   else 
      {
      output = wordOne + " does not have the same letters as " + wordTwo + "\n";
      }
      
		return output;
      
		// make a call to checkEquality to determine the message to print – example 			// message: wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}

