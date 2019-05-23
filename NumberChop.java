public class NumberChop
{
   private String number;
   private int sum;

	public NumberChop()
	{
   number = "";
   sum = 0;
	}

	public NumberChop(String num)
	{
   number = num;
	}


	public void setWord(String w)
	{
   number = w;
	}

	public void chopAndAdd()
	{

   
  int x = Integer.parseInt(number.substring(0,number.indexOf("@")));
  int y = Integer.parseInt(number.substring(number.indexOf("@")+1,number.lastIndexOf("@")));
  int z = Integer.parseInt(number.substring(number.lastIndexOf("@")+1,number.length()));



   sum = x + y + z;
		// process the String and put the total in sum in this method;
	}

	public String toString()
	{
		return "Number string " + number + " has a total of " + sum+ "\n";
	}
}
