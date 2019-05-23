public class WordsCompare
{
	private String wordOne, wordTwo;
   	private int compare;

	public WordsCompare()
	{
   wordOne ="";
   wordTwo = "";
   compare = 0;
	}

	public WordsCompare(String one, String two)
	{
   wordOne = one;
   wordTwo = two;
  
	}

	public void setWords(String one, String two)
	{
   wordOne = one;
   wordTwo = two;
	}

	public void compare()
	{
      
	}


	public String toString()
	{
   compare = wordOne.compareTo(wordTwo);
	   if (compare>0)
         {
         return wordOne + " should be placed after " + wordTwo;
         }
      else 
         return wordOne + " should be placed before " + wordTwo;
   }
}