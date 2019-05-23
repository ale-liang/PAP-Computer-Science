import java.util.Scanner;

public class RPSRunner
{
   private static String playAgain = "";
   
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      RPSGame test = new RPSGame();
      do
      {

         test.game();
         System.out.print("Would you like to play again? ");
         playAgain = kb.nextLine();
      }
      while(playAgain.charAt(0) == 'y' || playAgain.charAt(0) == 'Y');
      
      System.out.println("Total Wins: " + test.getWins());
      System.out.println("Total Games Played: " + test.getTotalGames());
   }


}