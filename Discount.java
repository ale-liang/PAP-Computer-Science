public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	//getDiscountedBill() will return final amount of the bill
	
	public static double getDiscountedBill(double bill)
	{
      if (bill > 2000)
         {
         return bill * 0.85;
         }
		return bill;
	}
}
