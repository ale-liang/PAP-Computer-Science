public class TriangleOne
{
   //this lab is setup with 2 static methods
   //there are no instance variables or additional methods / constructors

	public static String createTriBigOnBottom( String let, int size)
	{
		String output="";
         for(int n = 1; n <= size; n = n + 1)
            {
               for(int i = 1; i <= n; i = i + 1)
                  { output = output + let + ""; }
                  output = output + "\n";
            }
		return output;
	}
	public static String createTriBigOnTop(String let, int size)
	{
		String output="";
         for(int n = size; n >= 1; n = n - 1)
            {
               for(int i = n; i >= 1; i = i - 1)
                  { output = output + let + ""; }
                  output = output + "\n";
            }      
		return output;
	}
}
