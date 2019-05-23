public class WordFun2
{
	public static String moveEmAround(String a, int x)
	{
         if (x < a.length())
         {
   
      String b = a.substring(0,x);
      String c = a.replace(b,"");
      

         return c + b;
         }
      else
         return "no can do";
	}
}
