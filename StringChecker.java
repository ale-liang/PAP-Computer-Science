public class StringChecker
{
	private String word;

	public StringChecker()
	{
   word = "";
	}

	public StringChecker(String s)
	{
   word = s;
	}

   	public void setString(String s)
   	{
   		word=s;
   	}

	public boolean findLetter(char c)
	{
   word.indexOf(c);
   if (word.indexOf(c) >= 0)
   {
      return true;
   }

   
		return false;
	}

	public boolean findSubString(String s)
	{
   word.indexOf(s);
   if (word.indexOf(s) >= 0)
   {
   return true;
   }
		return false;
	}

 	public String toString()
 	{
 		return word +"\n\n";
	}
}
