public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
   letter = 0;
   amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
   letter = c;
   amount = amt;
	}

	public void setLetter(char c)
	{
      letter= c;
	}

	public void setAmount(int amt)
	{
      amount = amt;
	}

	public String toString()
	{
		String output="";
      letter = this.letter;
      amount = this.amount;
      char let = letter;
      int zero = 0;
      for(int times = 0; times <= amount; times = times + 1)
         {
            for(int i = amount; i > zero; i = i - 1)
               {
                  for(int a= i; a > 0; a--)
                     {

                        output = output + let;
                          
                     }
                     output += " ";
                     let++;
                     if(let == 91)
                        { let = 65; }
               }
               zero ++;
               let = letter;
               output += "\n";
         }
		return output;
	}
}
