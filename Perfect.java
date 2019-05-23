public class Perfect
{
   private int number;

	//add constructors
   public Perfect()
   {
   number = 0;
   }
   
   public Perfect(int num)
   {
   number = num;
   }
	//add a set method
   public void setNum(int num)
   {
   number = num;
   }
   
   
   
   
	public boolean isPerfect()
	{
      int d = 0;
       int n = 1;

      while(number > n)
            {
               if(number % n == 0)
               {
               d = d + n;
               }
               n = n+1;
            }
       if(d == number)
         {
         return true;
         }     
       else
         return false;
	}


   public String toString()
   {
      boolean p = isPerfect();
      
      if(p==true)
         return number + " is perfect.";
      else
         return number + " is not perfect.";
   }
	//add a toString	- should display the number and either is or is not perfect
	
}
