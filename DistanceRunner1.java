import static java.lang.System.*;
import java.util.Scanner;

public class DistanceRunner1
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );

		out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();

		Distance1 test = new Distance1();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test.determineClosest());

		out.print("Enter X1 :: ");
		 xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		 yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		 xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		 yTwo = keyboard.nextInt();

		Distance1 test1 = new Distance1();
		test1.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test1.determineClosest());
      
      		out.print("Enter X1 :: ");
		 xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		 yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		 xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		 yTwo = keyboard.nextInt();

		Distance1 test2 = new Distance1();
		test2.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test2.determineClosest());
      
      
      		out.print("Enter X1 :: ");
		 xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		 yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		 xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		 yTwo = keyboard.nextInt();

		Distance1 test3 = new Distance1();
		test3.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test3.determineClosest());	
		//add more test cases
	}
}
