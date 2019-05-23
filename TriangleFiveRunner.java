public class TriangleFiveRunner
{
   	public static void main(String args[])
   	{
		//don’t need input from user, just use test cases
      TriangleFive test = new TriangleFive('C',4);
		//instantiate object
      System.out.println(test);
		//print object
      test.setLetter('A');
      test.setAmount(5);
      System.out.println(test);
      test.setLetter('B');
      test.setAmount(7);
      System.out.println(test);
      test.setLetter('X');
      test.setAmount(6);
      System.out.println(test);
            test.setLetter('Z');
      test.setAmount(8);
      System.out.println(test);      
		//change letter and amount (using existing object)
		//print object
		//add at least 5 test cases
	}
}

 