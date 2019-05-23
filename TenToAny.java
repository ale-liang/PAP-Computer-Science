public class TenToAny
{
   private int base10;
   private int newBase;
   private int x;
   
   public TenToAny()
   {
   base10 = 0;
   newBase = 0;
   
   }
	//add constructors
   public TenToAny(int num, int base)
   {
   base10 = num;
   newBase = base;
   
   }
	//add a set method
   public void setNum(int num, int base)
   {
   base10 = num;
   newBase = base;
   }

	public String getNewNum()
	{
      int d = 0;
      String a = "";
      int x = base10;
		String newNum="";
         while(x > 0)
            {
               d = x % newBase;
                  if(d>9)
                     {
                        switch(d)
                        {
                        
                        case 10: a = "A";break;
                        case 11: a = "B";break;
                        case 12: a = "C";break;
                        case 13: a = "D";break;
                        case 14: a = "E";break;
                        case 15: a = "F";break;
                        case 16: a = "G";break;
                        }
                        newNum = a + newNum + "";
                     }   
                                        
               else
                  newNum = d + newNum + "";
               x = x / newBase;
               }
               return newNum;
            }
	
	

	//add a toString method – displays the complete message shown in Sample Output	
	public String toString()
   {
      String bop = getNewNum();
      return base10 + " base 10 is " + bop + " in base " + newBase;
   }
}
