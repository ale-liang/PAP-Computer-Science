public class MorseCode
{
	private char letter;

	public MorseCode()
	{
   letter = 0;
	}

	public MorseCode(char let)
	{
   letter = let;
	}

	public void setChar(char let)
	{
   letter = let;
	}

	public String getMorseCode()
	{
		String morse="";
      switch(letter)
      {
      case 65: morse = ".-"; break;
      case 66: morse = "-..."; break;
      case 67: morse = "-.-."; break;
      case 68: morse = "-.."; break;
      case 69: morse = "."; break;
      case 70: morse = "..-."; break;
      case 71: morse = "--."; break;
      case 72: morse = "...."; break;
      case 73: morse = ".."; break;
      case 74: morse = ".---"; break;
      case 75: morse = "-.-"; break;
      case 76: morse = ".-.."; break;
      case 77: morse = "--"; break;

      case 78: morse = "-."; break;

      case 79: morse = "---"; break;

      case 80: morse = ".--."; break;

      case 81: morse = "--.-"; break;

      case 82: morse = ".-."; break;

      case 83: morse = "..."; break;

      case 84: morse = "-"; break;

      case 85: morse = "..-"; break;

      case 86: morse = "...-"; break;

      case 87: morse = ".--"; break;

      case 88: morse = "-..-"; break;

      case 89: morse = "-.--"; break;

      case 90: morse = "--.."; break;

      case 48: morse = "-----"; break;

      case 49: morse = ".----"; break;

      case 50: morse = "..---"; break;

      case 51: morse = "...--"; break;

      case 52: morse = "....-"; break;

      case 53: morse = "....."; break;

      case 54: morse = "-...."; break;

      case 55: morse = "--..."; break;

      case 56: morse = "---.."; break;

      case 57: morse = "----."; break;

       
      

      
      }
		return morse;		
	}

	public String toString()
	{
		return getMorseCode() + "\n" + letter + " is " + getMorseCode() + " in morse!\n";
	}
}
