public class LoopStatsRunner
{
   public static void main(String[] args)
      {
      LoopStats test = new LoopStats(1,5);
      System.out.println(test + "\n");
      
      test.setNums(2,8);
      System.out.println(test + "\n");
      
      test.setNums(5,15);
      System.out.println(test);
      }


}