public class NumberChopRunner
{
   public static void main(String[] args)
   {
      NumberChop test = new NumberChop();
      test.setWord("456@56@234");
      test.chopAndAdd();
      System.out.println(test);
      
      NumberChop test1 = new NumberChop();
      test1.setWord("1@1@1");
      test1.chopAndAdd();
      System.out.println(test1);
      
      NumberChop test2 = new NumberChop();
      test2.setWord("102@2@12");
      test2.chopAndAdd();
      System.out.println(test2);
      
      NumberChop test3 = new NumberChop();
      test3.setWord("0@0@0");
      test3.chopAndAdd();
      System.out.println(test3);
   }
   
}