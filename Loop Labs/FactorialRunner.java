public class FactorialRunner
{

   public static void main(String[] args)
   {
      Factorial test = new Factorial(0);
      System.out.println(test);
      test.setNum(5);
      test.getFactorial();
      System.out.println(test);
      
      test.setNum(4);
      test.getFactorial();
      System.out.println(test);
      
      test.setNum(8);
      test.getFactorial();
      System.out.println(test);
      
      test.setNum(15);
      test.getFactorial();
      System.out.println(test);
      
      test.setNum(6);
      test.getFactorial();
      System.out.println(test);
      
      test.setNum(9);
      test.getFactorial();
      System.out.println(test);
      
      test.setNum(3);
      test.getFactorial();
      System.out.println(test);
   }

}