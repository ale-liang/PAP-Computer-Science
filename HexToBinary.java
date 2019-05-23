public class HexToBinary
{
	private char hex;


	public HexToBinary()
	{
      hex = 0;

	}

	public HexToBinary(char hexNum)
	{
      hex = hexNum;

	}

	public void setHex(char hexNum)
	{
      hex = hexNum;

	}

	public String getBinary()
	{
      String bin = "";
      switch(hex)
      {
         case 65 : bin = "1010"; break;
         case 66 : bin = "1011"; break;
         case 67 : bin = "1100"; break;
         case 68 : bin = "1101"; break;
         case 69 : bin = "1110"; break;
         case 70 : bin = "1111"; break;
         default : bin = "ERROR"; break;
      }
      


		return bin;  //must use a switch statement
	}

	public String toString()
	{
      String bin = getBinary();
		return hex + " is " + bin + " in binary!";
	}
}