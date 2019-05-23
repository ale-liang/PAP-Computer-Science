import java.util.*;

public class RomanNumeral
{
	private int number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		//constructor to accept a string (Roman numeral)
      roman = str;
	}

	public RomanNumeral(Integer orig)
	{
		//constructor to accept an integer (decimal number)
      number = orig;
	}

	public void setNumber(Integer num)
	{
		//mutator method
      number = num;
	}

	public void setRoman(String rom)
	{
		//mutator method
      roman = rom;
	}

	public int getNumber()
	{
		// return the decimal number
      int number = 0;
      int count = 0;
      String test = "";
      boolean test1 = true;
      for(int x = 0; x<roman.length(); x++)
         {
            if(roman.length()-x == 2)
               {
                  test = roman.substring(x);
               }
            else if(x + 1 == roman.length())
               {
                  test = "";
               }
            else
               {
                  test = roman.substring(x,x+2);
               }
            
            if(test.equals(LETTERS[1]))
               {
                  count += NUMBERS[1];
               }
            else if(test.equals(LETTERS[3]))
               {
                  count += NUMBERS[3];
                  test1=false;
               }
            else if(test.equals(LETTERS[5]))
               {
                  count += NUMBERS[5];
                  test1=false;
               }
            else if(test.equals(LETTERS[7]))
               {
                  count += NUMBERS[7];
                  test1=false;
               }
            else if(test.equals(LETTERS[9]))
               {
                  count += NUMBERS[9];
                  test1=false;
               }
            else if(test.equals(LETTERS[11]))
               {
                  count += NUMBERS[11];
                  test1=false;
               }

            if(test1 == true)
            {
               if(roman.substring(x,x+1).equals(LETTERS[0]))
               {
                  count += NUMBERS[0];
               }
               else if(roman.substring(x,x+1).equals(LETTERS[2]))
               {
                  count += NUMBERS[2];
               }
               else if(roman.substring(x,x+1).equals(LETTERS[4]))
               {
                  count += NUMBERS[4];
               }
               else if(roman.substring(x,x+1).equals(LETTERS[6]))
               {
                  count += NUMBERS[6];
               }
               else if(roman.substring(x,x+1).equals(LETTERS[8]))
               {
                  count += NUMBERS[8];
               }
               else if(roman.substring(x,x+1).equals(LETTERS[10]))
               {
                  count += NUMBERS[10];
               }
               else if(roman.substring(x,x+1).equals(LETTERS[12]))
               {
                  count += NUMBERS[12];
               }
            }
         }
         return count;
	}

	public String toString()
	{
		// return the Roman numeral
      int current = number;
      String roman = "";
      for(int x = 0; x<NUMBERS.length; x++)
         {
            while(number >= NUMBERS[x])
            {
               number = number - NUMBERS[x];
               roman = roman + LETTERS[x];
            }
         }
         return roman;
	}
}
