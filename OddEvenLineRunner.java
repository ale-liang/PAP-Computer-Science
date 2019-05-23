import java.util.*;
import java.lang.System.*;

public class OddEvenLineRunner
{
   private static String numbers;
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      String choice = "Y";
      do{
      System.out.print("Enter a list of numbers separated by spaces :: ");
      
      String numbers = "";
      numbers = kb.nextLine();
      OddEvenLine test = new OddEvenLine(numbers);
      test.setLine(numbers);
      //System.out.print(test);
      
      System.out.println("even count = " + test.getEvenAmount());
      System.out.println("odd count = " + test.getOddAmount());
      System.out.println("The even numbers are: " + test.getEvenString());
      System.out.println("The odd numbers are: " + test.getOddString());
     //kb.nextLine();
      System.out.print("Would you like to try again? :: ");
      choice = kb.nextLine();
      }while(choice.equals("Y")||choice.equals("y"));
   }
} 