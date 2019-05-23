public class RPSGame
{
   private int wins, totalGames;
   private Player player, computer;
   
   public RPSGame()
   {
   wins = 0;
   totalGames = 0;
   player = new Player();
   computer = new Player();
   }


   public void game()
   {
   int number  = (int) (Math.random()*30);
   player.chooseWeapon();
   computer.chooseWeapon(number);
   System.out.println("player had " + player.getWeapon());
   System.out.println("computer had " + computer.getWeapon());
   if (player.getWeapon().equals( "R"))
      {
         if(computer.getWeapon().equals("R"))
            {
            System.out.println("Draw Game!" + "\n");
            totalGames = totalGames + 1;
            }
         else if (computer.getWeapon().equals("S"))
            {
            System.out.println("Player wins! <<Rock breaks Scissors>>" + "\n");
            wins = wins + 1;
            totalGames = totalGames + 1;
            }
         else if (computer.getWeapon().equals("P"))
            {
            System.out.println("Computer wins! <<Paper covers Rock>>" + "\n");
            totalGames = totalGames + 1;
            }
      }
   if (player.getWeapon().equals("S"))
      {
         if(computer.getWeapon().equals("R"))
            {
            System.out.println("Computer wins! <<Rock breaks Scissors>>" + "\n");
            totalGames = totalGames + 1;
            }
         else if (computer.getWeapon().equals("S"))
            {
            System.out.println("Draw Game!" + "\n");
            totalGames = totalGames + 1;
            }
         else if (computer.getWeapon().equals("P"))
            {
            System.out.println("Player wins! <<Scissors cuts Paper>>" + "\n");
            totalGames = totalGames + 1;
            wins = wins + 1;
            }  
      }      
                   
   if (player.getWeapon().equals("P"))
      {
         if(computer.getWeapon().equals("R"))
            {
            System.out.println("Player wins! <<Paper covers Rock>>" + "\n");
            totalGames = totalGames + 1;
            wins = wins + 1;
            }
         else if (computer.getWeapon().equals("S"))
            {
            System.out.println("Computer wins! <<Scissors cuts Paper>>" + "\n");
            totalGames = totalGames + 1;
            }
         else if (computer.getWeapon().equals("P"))
            {
            System.out.println("Draw Game!" + "\n");
            totalGames = totalGames + 1;
            }        
      }
  } 
   




   public int getWins()
   {
   return wins;
   }
   
   public int getTotalGames()
   {
   return totalGames;
   }
   
}