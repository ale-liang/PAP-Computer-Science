
public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
      sentence = "";
      lookFor = 0;
      
		//call set
	}
   
   public LetterRemover(String s, char rem)
   {
      sentence = s;
      lookFor = rem;
   }

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned="";
      int loc = sentence.indexOf(lookFor);
      while(loc >= 0 && loc < sentence.length())
         {
            sentence = sentence.substring(0,loc) + sentence.substring(loc+1);
            loc = sentence.indexOf(lookFor);
         }
      cleaned = sentence;
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}
