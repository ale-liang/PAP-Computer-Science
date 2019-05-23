import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a whole number:: ");
      int int1 = keyboard.nextInt();
		System.out.println(int1 + " is odd :: " + NumberVerify.isOdd(int1));
		System.out.println(int1 + " is even :: " + NumberVerify.isEven(int1));
		
            System.out.print("Enter a whole number:: ");
      int int2 = keyboard.nextInt();
		System.out.println(int2 + " is odd :: " + NumberVerify.isOdd(int2));
		System.out.println(int2 + " is even :: " + NumberVerify.isEven(int2));
      
            System.out.print("Enter a whole number:: ");
      int int3 = keyboard.nextInt();
		System.out.println(int3 + " is odd :: " + NumberVerify.isOdd(int3));
		System.out.println(int3 + " is even :: " + NumberVerify.isEven(int3));
      
            System.out.print("Enter a whole number:: ");
      int int4 = keyboard.nextInt();
		System.out.println(int4 + " is odd :: " + NumberVerify.isOdd(int4));
		System.out.println(int4 + " is even :: " + NumberVerify.isEven(int4));
      
            System.out.print("Enter a whole number:: ");
      int int5 = keyboard.nextInt();
		System.out.println(int5 + " is odd :: " + NumberVerify.isOdd(int5));
		System.out.println(int5 + " is even :: " + NumberVerify.isEven(int5));
		//add in more test cases
	}
}
