import java.util.Scanner;

public class GuessingGameRunner
{
private static String playAgain = "";
   
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);

 
      do
      {
         GuessingGame test = new GuessingGame();
         test.game();
         System.out.print("Would you like to play again? ");
         playAgain = kb.nextLine();
      }
      while(playAgain.charAt(0) == 'y' || playAgain.charAt(0) == 'Y');
      }

}