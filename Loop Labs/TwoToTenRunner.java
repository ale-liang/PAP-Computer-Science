public class TwoToTenRunner
{

   public static void main(String[] args)
   {
      TwoToTen test = new TwoToTen("1010");
      System.out.println(test);
      
      test.setTwo("1100");
      test.getBaseTen();
      System.out.println(test);
      
      test.setTwo("1110");
      test.getBaseTen();
      System.out.println(test);
      
      test.setTwo("1111");
      test.getBaseTen();
      System.out.println(test);
      
      test.setTwo("11111");
      test.getBaseTen();
      System.out.println(test);
      
      test.setTwo("111111");
      test.getBaseTen();
      System.out.println(test);
      
      test.setTwo("1110101");
      test.getBaseTen();
      System.out.println(test);
      
      test.setTwo("10101010101");
      test.getBaseTen();
      System.out.println(test);
      
      test.setTwo("1010101010110");
      test.getBaseTen();
      System.out.println(test);
      
      test.setTwo("111111111111111111");
      test.getBaseTen();
      System.out.println(test);

   }

}