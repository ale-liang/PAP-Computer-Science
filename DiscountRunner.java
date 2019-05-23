import java.util.Scanner;
import java.lang.System.*;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
      System.out.print("Bill after discount :: ");
      System.out.println(String.format("%.2f",Discount.getDiscountedBill(amt)));
		
		System.out.print("Enter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
      System.out.print("Bill after discount :: ");
      System.out.println(String.format("%.2f",Discount.getDiscountedBill(amt1)));
      
      		System.out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
      System.out.print("Bill after discount :: ");
      System.out.println(String.format("%.2f",Discount.getDiscountedBill(amt2)));
      
      		System.out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
      System.out.print("Bill after discount :: ");
      System.out.println(String.format("%.2f",Discount.getDiscountedBill(amt3)));
      
      		System.out.print("Enter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
      System.out.print("Bill after discount :: ");
      System.out.println(String.format("%.2f",Discount.getDiscountedBill(amt4)));
	}
}
