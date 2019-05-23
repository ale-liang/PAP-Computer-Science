import java.util.Scanner;

public class ScannerDemo
{
   public static void main(String[] args)
   {
      
      Scanner keyboard = new Scanner(System.in);
      /*
      System.out.print("Enter a doubleOne:: ");
      double numOne = keyboard.nextDouble();
      System.out.println(numOne);
      System.out.print("Enter a doubleTwo:: ");
      double numTwo = keyboard.nextDouble();
      System.out.println(numTwo);
      double sum = numOne + numTwo;
      System.out.print("The sum of doubleOne and doubleTwo is " + sum);
      System.out.print("Enter a sentence:: ");
      String word = keyboard.nextLine();
      System.out.print("You entered " + word);
      */
      System.out.print("Enter an integer:: ");
      int num1 = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Enter a sentence:: ");
      String sentence = keyboard.nextLine();
      System.out.println(num1 + " " + sentence);
   }
}