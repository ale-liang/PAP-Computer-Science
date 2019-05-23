public class Decoder
{
	private char letter;

	public Decoder()
	{
      letter = 0;
	}

	public Decoder(char let)
	{
      letter = let;
	}

	public void setLetter(char let)
	{
      letter = let;
	}

	public char deCode()
	{
		char result=0;
      switch (letter)
      {
         case 65: result =97; break;
         case 66: result =98; break;
         case 97: result =65; break;
         case 98: result =66; break;
         case 99: result =67; break;
         case 100: result =68;break;
         case 101: result =69;break;
         case 102: result =70;break;
         case 103: result =71;break;
         case 104: result =72;break;
         case 105: result =73;break;
         case 106: result =74;break;
         case 107: result =75;break;
         case 108: result =76;break;
         case 109: result =77;break;
         case 110: result =78;break;
         case 111: result =79;break;
         case 112: result =80;break;
         case 113: result =81;break;
         case 114: result =82;break;
         case 48: result =65; break;
         default: result =35; break; 
         case 84: result =116; break;
         case 116: result =84; break;
         case 67: result = 99; break;
         case 72: result =104;break;
         case 49: result =66;break;
         case 50: result =67;break;
         case 51: result =68;break;
         case 52: result =69;break;
         case 53: result = 70;break;
         case 54: result =71;break;
         case 55: result =72;break;
         case 56: result =73; break;
         case 57: result = 74;break;
         case 68: result =100;break;
         case 69: result =101;break;
         case 70: result = 102; break;
         case 71: result = 103; break;
         case 73: result = 105; break;
         case 74: result = 106; break;
         case 75: result = 107; break;
         case 76: result = 108; break;
         case 77: result = 109; break;
         case 78: result = 110;break;
         case 79: result = 111;break;
         case 80: result =112; break;
         case 81: result =113;break;
         case 82: result =114;break;
         case 83: result =115;break;
         
      }






		return result;
	}

	public String toString()
	{
      char result = deCode();
		return letter + " decodes to " + result;
	}
}
